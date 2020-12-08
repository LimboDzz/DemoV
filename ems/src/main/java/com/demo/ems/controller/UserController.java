package com.demo.ems.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.demo.ems.entity.User;
import com.demo.ems.service.UserService;
import com.demo.ems.utils.ValidateImageCodeUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 标记控制器类
@Controller
// 给出触发路径
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("regist")
    public String regist(User user, String code, HttpServletRequest req) {
        System.out.println(user);
        HttpSession session = req.getSession();
        // check securityCode
        if (session.getAttribute("securityCode").toString().equalsIgnoreCase(code)) {
            userService.save(user);
            return "redirect:/ems/login.jsp";
        } else {
            return "redirect:/ems/regist.jsp";
        }
    }

    @GetMapping("getImage")
    public void getImage(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // String securityCode = ValidateImageCodeUtils.getSecurityCode();
        // System.out.println(securityCode);
        // BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        // ImageIO.write(image,"png",new FileOutputStream("aa.png"));
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        HttpSession session = req.getSession();
        session.setAttribute("securityCode", securityCode);
        
        ServletOutputStream os = res.getOutputStream();
        ImageIO.write(image, "png", os);

    }
}
