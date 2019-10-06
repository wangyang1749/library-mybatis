package com.tes;

import com.syyb.common.pojo.JQueryPager;
import com.syyb.seat.pojo.TSeat;
import com.syyb.seat.service.SeatService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TesSeat {

    @Resource
    SeatService seatService;
    @Test
    public void selByPage(){
        JQueryPager<TSeat> tSeatJQueryPager = seatService.selByPage(5, 1);
        System.out.println(tSeatJQueryPager.getRows());
    }
    @Test
    public void updateSeatNUmber(){
        seatService.updateSeatBySeatNumber(15,0);
    }

    @Test
    public void load(){
        seatService.loadTSeat(15);
    }
}
