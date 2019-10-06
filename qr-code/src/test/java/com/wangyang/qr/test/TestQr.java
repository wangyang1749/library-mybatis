package com.wangyang.qr.test;

import com.wangyang.qr.QRCodeUtil;
import org.junit.Test;

public class TestQr {

    @Test
    public void test01(){
        String text = "yiban_scan_result:wangyang";
        try {
            QRCodeUtil.encode(text,"", "D:\\test",true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
