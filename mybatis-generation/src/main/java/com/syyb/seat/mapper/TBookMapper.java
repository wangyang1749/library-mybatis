package com.syyb.seat.mapper;

import com.syyb.seat.pojo.TBook;
import com.syyb.seat.pojo.TBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBookMapper {
	 List<TBook> selByPage(Map<String,Object> map);
    long countByExample(TBookExample example);

    int deleteByExample(TBookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBook record);

    int insertSelective(TBook record);

    List<TBook> selectByExample(TBookExample example);

    TBook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBook record, @Param("example") TBookExample example);

    int updateByExample(@Param("record") TBook record, @Param("example") TBookExample example);

    int updateByPrimaryKeySelective(TBook record);

    int updateByPrimaryKey(TBook record);
}