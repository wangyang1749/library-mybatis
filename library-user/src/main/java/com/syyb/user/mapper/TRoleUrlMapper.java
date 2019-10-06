package com.syyb.user.mapper;

import com.syyb.user.pojo.TRoleUrl;
import com.syyb.user.pojo.TRoleUrlExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TRoleUrlMapper {

    long countByExample(TRoleUrlExample example);

    int deleteByExample(TRoleUrlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TRoleUrl record);

    int insertSelective(TRoleUrl record);

    List<TRoleUrl> selectByExample(TRoleUrlExample example);

    TRoleUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TRoleUrl record, @Param("example") TRoleUrlExample example);

    int updateByExample(@Param("record") TRoleUrl record, @Param("example") TRoleUrlExample example);

    int updateByPrimaryKeySelective(TRoleUrl record);

    int updateByPrimaryKey(TRoleUrl record);
}