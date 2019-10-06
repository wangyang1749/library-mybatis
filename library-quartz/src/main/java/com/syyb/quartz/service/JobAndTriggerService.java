package com.syyb.quartz.service;


import com.github.pagehelper.PageInfo;
import com.syyb.quartz.pojo.JobAndTrigger;


public interface JobAndTriggerService {
	PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}
