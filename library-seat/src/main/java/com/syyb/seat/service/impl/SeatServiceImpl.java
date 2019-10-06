package com.syyb.seat.service.impl;

import com.syyb.common.pojo.JQueryPager;
import com.syyb.seat.dto.SeatDto;
import com.syyb.seat.exception.SeatException;
import com.syyb.seat.mapper.TBookMapper;
import com.syyb.seat.mapper.TSeatMapper;
import com.syyb.seat.pojo.TBook;
import com.syyb.seat.pojo.TBookExample;
import com.syyb.seat.pojo.TSeat;
import com.syyb.seat.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("seatService")
public class SeatServiceImpl implements SeatService {
    @Autowired
    TSeatMapper seatMapper;
    @Autowired
    TBookMapper bookMapper;

    @Override
    public JQueryPager<TSeat> selByPage(int rows,int page) {
        JQueryPager<TSeat> pager = new JQueryPager<>();
        Map<String,Object> map = new HashMap<>();
        map.put("currPage",page);
        map.put("pageSize",rows);
        List<TSeat> urls = seatMapper.selByPage(map);
        int count =((int) map.get("count"));
        pager.setRows(urls);
        pager.setTotal(count);
        return pager;
    }

    @Override
    public void updateSeatBySeatNumber(int seatNumber,int status) {
        TSeat seat = new TSeat();
        seat.setSeatNumber(seatNumber);
        seat.setStatus(status);
        seatMapper.updateByPrimaryKeySelective(seat);
    }
//定义座位状态1为占用,0为未占用
    @Override
    public SeatDto loadTSeat(int id) {
        SeatDto seatDto = new SeatDto();
        TSeat seat = seatMapper.selectByPrimaryKey(id);
        if(seat==null) throw  new SeatException("座位不存在!!");
        if(seat.getStatus()==4) throw  new SeatException("此座位处于异常状态!!");
        seatDto.setSeatNumber(seat.getSeatNumber());
        seatDto.setRoomNumber(seat.getRoomNumber());
        seatDto.setStatus(seat.getStatus());
        seatDto.setSeatDesc(seat.getSeatDesc());
        if(seat.getStatus()==1||seat.getStatus()==2||seat.getStatus()==3){
            TBookExample example = new TBookExample();
            //通过座位和未过期可以唯一确定一条记录
            example.createCriteria().andSeatIdEqualTo(id).andExpireEqualTo(1);
            List<TBook> books = bookMapper.selectByExample(example);
            if(books.size()>0) {
                TBook existBook = books.get(0);
                seatDto.setUserId(existBook.getUserId());
                seatDto.setStratTime(existBook.getStratTime());
                seatDto.setEndTime(existBook.getEndTime());
            }
        }
        return seatDto;
    }
}
