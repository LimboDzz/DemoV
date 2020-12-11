package com.demo.ems.controller;

import java.util.List;

import com.demo.ems.entity.Emp;
import com.demo.ems.service.EmpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @PostMapping("save")
    public String save(Emp emp) {
        empService.save(emp);
        return "redirect:/emp/findAll";
    }

    @GetMapping("findAll")
    public String findAll(Model model) {
        List<Emp> emps = empService.findAll();
        System.out.println(emps);
        model.addAttribute("emps", emps);
        // 注意这里不能用redirect（也可能是model问题）否则前端页面取不到数据 原因待查
        return "ems/emplist";
    }

    @GetMapping("delete")
    public String delete(String id) {
        System.out.println(id);
        empService.delete(id);
        return "redirect:/emp/findAll";
    }

    @GetMapping("findById")
    public String findById(String id, Model model) {
        Emp emp = empService.findById(id);
        System.out.println(emp);
        model.addAttribute("emp", emp);
        return "ems/updateEmp";
    }

    @PostMapping(value="update")
    public String update(Emp emp) {
        empService.update(emp);
        return "redirect:/emp/findAll";
    }
}
