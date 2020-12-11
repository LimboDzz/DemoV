package com.demo.ems.service;

import java.util.List;

import com.demo.ems.entity.Emp;

public interface EmpService {
    public void save(Emp emp);

    public List<Emp> findAll();

    public void delete(String id);

    public Emp findById(String id);

    public void update(Emp emp);
}
