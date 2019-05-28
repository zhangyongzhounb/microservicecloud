package com.zyz.springcloud.service;

import com.zyz.springcloud.entities.Dept;

import java.util.List;

/**
 * Created by yongzhou.zhang on 2019/5/28.
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
