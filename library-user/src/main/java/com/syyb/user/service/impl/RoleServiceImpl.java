package com.syyb.user.service.impl;

import com.syyb.user.dto.JQueryPager;
import com.syyb.user.mapper.TRoleMapper;
import com.syyb.user.pojo.TRole;
import com.syyb.user.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    TRoleMapper roleMapper;
    @Override
    public void add(TRole role) {
        roleMapper.insert(role);
    }

    @Override
    public void delRole(int id) {
        //TODO
        roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateRole(TRole role) {

    }

    @Override
    public JQueryPager<TRole> selByPage(int rows, int page) {
        JQueryPager<TRole> pager = new JQueryPager<>();
        Map<String,Object> map = new HashMap<>();
        map.put("currPage",page);
        map.put("pageSize",rows);
        List<TRole> roles = roleMapper.findByPage(map);
        int count =((int) map.get("count"));
        pager.setRows(roles);
        pager.setTotal(count);
        return pager;

    }
}
