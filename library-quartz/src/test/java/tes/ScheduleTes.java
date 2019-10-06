package tes;

import com.syyb.quartz.service.ScheduleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext-dao.xml")
public class ScheduleTes  {

    @Autowired
    Scheduler scheduler;
    @Autowired
    ScheduleService scheduleService;
    @Test
    public void addJob(){
        scheduleService.addJob("com.syyb.quartz.job.HelloJob","group1","* * * * * ?");
    }

    @Test
    public void jobresume() throws InterruptedException {
        scheduleService.jobresume("myjob08","group1");
        Thread.sleep(6000);
    }
    @Test
    public void job() throws SchedulerException, InterruptedException {
        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("myjob08","group").build();

        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("myTrigger08","group").startNow().withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever()).build();

//        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(jobDetail,trigger);
        Thread.sleep(6000);
    }

    public static void main(String[] args) {

    }
}
