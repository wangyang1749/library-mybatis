package com.syyb;

import com.syyb.user.dto.JQueryPager;
import com.syyb.user.mapper.TUrlMapper;
import com.syyb.user.pojo.TUrl;
import com.syyb.user.service.UrlService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TesUrl {

    @Autowired
    UrlService urlService;
    @Autowired
    TUrlMapper urlMapper;
    @Test
    public void allUrl(){
        Set<String> urls = urlMapper.listUrl(12927286);
        System.out.println(urls);
    }
    @Test
    public void findByPage(){
        JQueryPager<TUrl> tUrlJQueryPager = urlService.selByPage(10, 1);
        System.out.println(tUrlJQueryPager.getRows());

    }
}
