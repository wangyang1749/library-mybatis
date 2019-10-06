package com.syyb.user.mapper;

import com.syyb.user.pojo.TRoleMenu;
import com.syyb.user.pojo.TRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRoleMenuMapper {
    long countByExample(TRoleMenuExample example);

    int deleteByExample(TRoleMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TRoleMenu record);

    int insertSelective(TRoleMenu record);

    List<TRoleMenu> selectByExample(TRoleMenuExample example);

    TRoleMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TRoleMenu record, @Param("example") TRoleMenuExample example);

    int updateByExample(@Param("record") TRoleMenu record, @Param("example") TRoleMenuExample example);

    int updateByPrimaryKeySelective(TRoleMenu record);

    int updateByPrimaryKey(TRoleMenu record);
}