package com.yiban;

import cn.yiban.open.AppUtil;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class ApiQuery {
    @Test
    public void testQuery(){
        String token = AppUtil.queryAucthorize("d02c80d58d4cdd2611c0ba3d322233fc39708a8a");
        System.out.println(token);
    }
    @Test
    public void rmoveToken(){
        String s = AppUtil.removeToken("f2dd4707f50687a7a44c0c43bcd8adec706159fa");
        System.out.println(s);
    }

    @Test
    public void verifyInfo(){
        String info = AppUtil.verifyInfo("b8a07b73b57d9b8a70653264dac0886ff76f4a3c");
        JSONObject jsonObject = JSONObject.parseObject(info).getJSONObject("info");
        String yb_classname = jsonObject.getString("yb_classname");
        System.out.println(yb_classname);
    }
}
