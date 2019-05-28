package com.zyz.springcloud.dao;

import com.zyz.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by yongzhou.zhang on 2019/5/28.
 */
//?????
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
