package com.demo.ems.controller;

import java.net.http.HttpRequest;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.demo.ems.entity.Emp;
import com.demo.ems.service.EmpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("findAll")
    public String findAll(HttpServletRequest req) {
        List<Emp> emps = empService.findAll();
        System.out.println(emps);
        req.setAttribute("emps", emps);
        // no redirection, no .jsp
        return "redirect:/ems/emplist.jsp";
    }
}
