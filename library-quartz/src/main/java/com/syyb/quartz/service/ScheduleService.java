package com.syyb.quartz.service;

public interface ScheduleService {
    void addJob(String jobClassName, String jobGroupName, String cronExpression);
    void jobPause(String jobClassName, String jobGroupName);
    void jobresume(String jobClassName, String jobGroupName);
    void jobreschedule(String jobClassName, String jobGroupName, String cronExpression);
    void jobdelete(String jobClassName, String jobGroupName);

}
