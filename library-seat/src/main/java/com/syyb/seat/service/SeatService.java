package com.syyb.seat.service;

import com.syyb.common.pojo.JQueryPager;
import com.syyb.seat.dto.SeatDto;
import com.syyb.seat.pojo.TSeat;

public interface SeatService {

    JQueryPager<TSeat> selByPage(int rows,int page);

    /**
     * 根据座位编号更改座位状态
     */
    void updateSeatBySeatNumber(int seatNumber,int status);

    /**
     * 根据座位编号查找座位
     * @param id
     * @return
     */
    SeatDto loadTSeat(int id);


}
