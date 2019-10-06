package com.syyb.user.mapper;

import com.syyb.user.pojo.TSysSchool;
import com.syyb.user.pojo.TSysSchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysSchoolMapper {
    long countByExample(TSysSchoolExample example);

    int deleteByExample(TSysSchoolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSysSchool record);

    int insertSelective(TSysSchool record);

    List<TSysSchool> selectByExample(TSysSchoolExample example);

    TSysSchool selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSysSchool record, @Param("example") TSysSchoolExample example);

    int updateByExample(@Param("record") TSysSchool record, @Param("example") TSysSchoolExample example);

    int updateByPrimaryKeySelective(TSysSchool record);

    int updateByPrimaryKey(TSysSchool record);
}