package com.syyb.seat.mapper;

import com.syyb.seat.pojo.TSeat;
import com.syyb.seat.pojo.TSeatExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TSeatMapper {

List<TSeat> selByPage(Map<String,Object> map);
    long countByExample(TSeatExample example);

    int deleteByExample(TSeatExample example);

    int deleteByPrimaryKey(Integer seatNumber);

    int insert(TSeat record);

    int insertSelective(TSeat record);

    List<TSeat> selectByExample(TSeatExample example);

    TSeat selectByPrimaryKey(Integer seatNumber);

    int updateByExampleSelective(@Param("record") TSeat record, @Param("example") TSeatExample example);

    int updateByExample(@Param("record") TSeat record, @Param("example") TSeatExample example);

    int updateByPrimaryKeySelective(TSeat record);

    int updateByPrimaryKey(TSeat record);
}