package com.syyb.user.mapper;

import com.syyb.user.pojo.TTeacher;
import com.syyb.user.pojo.TTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTeacherMapper {
    long countByExample(TTeacherExample example);

    int deleteByExample(TTeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTeacher record);

    int insertSelective(TTeacher record);

    List<TTeacher> selectByExample(TTeacherExample example);

    TTeacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTeacher record, @Param("example") TTeacherExample example);

    int updateByExample(@Param("record") TTeacher record, @Param("example") TTeacherExample example);

    int updateByPrimaryKeySelective(TTeacher record);

    int updateByPrimaryKey(TTeacher record);
}