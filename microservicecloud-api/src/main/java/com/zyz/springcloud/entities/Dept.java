package com.zyz.springcloud.entities;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by yongzhou.zhang on 2019/5/28.
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable { // Dept(Entity) orm mysql->Dept(table) 类表关系映射

    private Long deptno; //主键
    private String dname; //部门名称
    private String db_source; //来自于哪个数据库，因为微服务框架可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        this.dname = dname;
    }

    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setDeptno(11L).setDname("RD").setDb_source("DB01");
    }
}
