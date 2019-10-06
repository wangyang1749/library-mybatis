package com.syyb.user.service.impl;

import com.syyb.user.dto.JQueryPager;
import com.syyb.user.mapper.TUrlMapper;
import com.syyb.user.pojo.TUrl;
import com.syyb.user.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service("urlService")
public class UrlServiceImpl implements UrlService {

    @Autowired
    TUrlMapper urlMapper;
    @Override
    public Set<String> listUrl(int uid) {
        return urlMapper.listUrl(uid);
    }

    @Override
    public JQueryPager<TUrl> selByPage(int rows, int page) {
        JQueryPager<TUrl> pager = new JQueryPager<>();
        Map<String,Object> map = new HashMap<>();
        map.put("currPage",page);
        map.put("pageSize",rows);
        List<TUrl> urls = urlMapper.findByPage(map);
        int count =((int) map.get("count"));
        pager.setRows(urls);
        pager.setTotal(count);
        return pager;
    }
}
