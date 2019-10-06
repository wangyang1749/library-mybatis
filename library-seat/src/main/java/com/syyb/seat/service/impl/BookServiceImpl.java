package com.syyb.seat.service.impl;

import com.syyb.common.pojo.JQueryPager;
import com.syyb.common.util.DateUtil;
import com.syyb.seat.exception.SeatException;
import com.syyb.seat.mapper.TBookMapper;
import com.syyb.seat.mapper.TSeatMapper;
import com.syyb.seat.pojo.TBook;
import com.syyb.seat.pojo.TBookExample;
import com.syyb.seat.pojo.TSeat;
import com.syyb.seat.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    TSeatMapper seatMapper;
    @Autowired
    TBookMapper bookMapper;
    @Override
    public JQueryPager<TBook> selByPage(int rows, int page) {
        JQueryPager<TBook> pager = new JQueryPager<>();
        Map<String,Object> map = new HashMap<>();
        map.put("currPage",page);
        map.put("pageSize",rows);
        List<TBook> urls = bookMapper.selByPage(map);
        int count =((int) map.get("count"));
        pager.setRows(urls);
        pager.setTotal(count);
        return pager;
    }

    @Override
    public TBook selBySeatNumberAndExpire(int seatNumber, int expire) {
        TBookExample example = new TBookExample();
        example.createCriteria().andSeatIdEqualTo(seatNumber).andExpireEqualTo(expire);
        List<TBook> books = bookMapper.selectByExample(example);
        if(books.size()<=0)return null;
        return books.get(0);
//        return null;
    }


    @Override
    public void downSeat(int seatNumber,int userId) {
        changeSeatAddBook(seatNumber,userId,1);
    }

    @Override
    public void seatReserve(int seatNumber,int userId) {
        changeSeatAddBook(seatNumber,userId,2);
    }

    private void changeSeatAddBook(int seatNumber,int userId,int status){
        TSeat seat = seatMapper.selectByPrimaryKey(seatNumber);
        if (seat==null||seat.getStatus()!=0)throw new SeatException("座位不存在或未处于空闲状态!!");
        seat.setStatus(status);
        seatMapper.updateByPrimaryKeySelective(seat);
        TBook book = new TBook();
        book.setSeatId(seatNumber);
        book.setUserId(userId);
        book.setExpire(1);
        book.setStratTime(new Date());
        bookMapper.insertSelective(book);
    }
}
