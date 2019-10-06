package com.syyb.seat.service;

import com.syyb.common.pojo.JQueryPager;
import com.syyb.seat.pojo.TBook;

public interface BookService {

    JQueryPager<TBook> selByPage(int rows, int page);

    /**
     * 根据座位编号查找没有过期预约的座位
     * @param seatNumber
     * @return
     */
    TBook selBySeatNumberAndExpire(int seatNumber,int expire);

    /**
     *扫码落座
     * @param book
     */
    void downSeat(int seatNumber,int userId);

    /**
     * 根据座位编号预定座位
     * @param seatNumber
     */
    void seatReserve(int seatNumber,int userId);
}
