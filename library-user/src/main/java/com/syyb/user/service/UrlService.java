package com.syyb.user.service;

import com.syyb.user.dto.JQueryPager;
import com.syyb.user.pojo.TUrl;

import java.util.Set;

public interface UrlService {
    Set<String> listUrl(int uid);
    JQueryPager<TUrl> selByPage(int rows,int page);
}
