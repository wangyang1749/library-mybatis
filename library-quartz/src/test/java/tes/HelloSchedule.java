package tes;

import org.junit.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSchedule {
//    @Test
    public static   void useQuartz(Scheduler scheduler) throws SchedulerException {
        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("myjob09","group04").build();

        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("myTrigger09","group04").startNow().withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever()).build();

//        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(jobDetail,trigger);


    }


    public static void main(String[] args) throws SchedulerException {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        Scheduler scheduler = factory.getBean(Scheduler.class);
        useQuartz(scheduler);
    }
}
