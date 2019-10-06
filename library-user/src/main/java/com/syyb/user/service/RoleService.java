package com.syyb.user.service;

import com.syyb.user.dto.JQueryPager;
import com.syyb.user.pojo.TRole;



public interface RoleService {
    /**
     *添加角色
     * @param role
     */
    void add(TRole role);

    /**
     * 删除角色
     * @param id
     */
    void delRole(int id);

    /**
     * 更新角色
     * @param role
     */
    void updateRole(TRole role);

    /**
     * 采用EasyUI框架分页
     * @param rows
     * @param page
     * @return
     */
    JQueryPager<TRole> selByPage(int rows, int page);
}
