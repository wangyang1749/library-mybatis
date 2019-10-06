package com.syyb.user.mapper;

import com.syyb.user.pojo.TUrl;
import com.syyb.user.pojo.TUrlExample;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TUrlMapper {

    @Select("select * from t_url")
    List<TUrl> findByPage(Map<String,Object> map);

    @Select("SELECT name FROM t_url WHERE id in (SELECT u_id from t_role_url WHERE r_id in (SELECT r_id FROM t_user_role WHERE u_id=#{uid}))")
    Set<String> listUrl(int uid);
    long countByExample(TUrlExample example);

    int deleteByExample(TUrlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUrl record);

    int insertSelective(TUrl record);

    List<TUrl> selectByExample(TUrlExample example);

    TUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUrl record, @Param("example") TUrlExample example);

    int updateByExample(@Param("record") TUrl record, @Param("example") TUrlExample example);

    int updateByPrimaryKeySelective(TUrl record);

    int updateByPrimaryKey(TUrl record);
}