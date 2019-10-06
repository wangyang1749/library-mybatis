package com.syyb.quartz.service.impl;

import com.syyb.quartz.job.BaseJob;
import com.syyb.quartz.service.ScheduleService;
import org.quartz.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService {

    @Resource(name = "scheduler")
    private Scheduler scheduler;
    @Override
    public void addJob(String jobClassName, String jobGroupName, String cronExpression) {
        try {
            // 启动调度器
            scheduler.start();
            //构建job信息
            JobDetail jobDetail = JobBuilder.newJob(getClass(jobClassName).getClass()).withIdentity(jobClassName, jobGroupName).build();



            //表达式调度构建器(即任务执行的时间)
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cronExpression);
            //按新的cronExpression表达式构建一个新的trigger
            CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(jobClassName, jobGroupName)
                    .withSchedule(scheduleBuilder).build();


            scheduler.scheduleJob(jobDetail, trigger);
        } catch (SchedulerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        } catch (SchedulerException e) {
//            System.out.println("创建定时任务失败"+e);
//            throw new Exception("创建定时任务失败");
//        }
    }

    @Override
    public void jobPause(String jobClassName, String jobGroupName) {

    }

    @Override
    public void jobresume(String jobClassName, String jobGroupName) {
        try {
            scheduler.resumeJob(JobKey.jobKey(jobClassName, jobGroupName));
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void jobreschedule(String jobClassName, String jobGroupName, String cronExpression) {

    }

    @Override
    public void jobdelete(String jobClassName, String jobGroupName) {

    }

    public  BaseJob getClass(String classname) throws Exception
    {
        Class<?> class1 = Class.forName(classname);
        return (BaseJob)class1.newInstance();
    }
}
