package com.demo.ems.dao;

import java.util.List;

import com.demo.ems.entity.Emp;

public interface EmpDAO {
    void save(Emp emp);

    List<Emp> findAll();
}
