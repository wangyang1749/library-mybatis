package com.syyb.quartz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syyb.quartz.mapper.JobAndTriggerMapper;
import com.syyb.quartz.pojo.JobAndTrigger;
import com.syyb.quartz.service.JobAndTriggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("jobAndTriggerService")
public class JobAndTriggerServiceImpl implements JobAndTriggerService {
    @Autowired
    private JobAndTriggerMapper jobAndTriggerMapper;

    @Override
    public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<JobAndTrigger> list = jobAndTriggerMapper.getJobAndTriggerDetails();
        PageInfo<JobAndTrigger> page = new PageInfo<JobAndTrigger>(list);
        return page;
    }
}
