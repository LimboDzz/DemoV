package com.demo.ems.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.ems.utils.ValidateImageCodeUtils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 标记控制器类
@Controller
// 给出触发路径
@RequestMapping("user")
public class UserController {
    @GetMapping("getImage")
    public void getImage(HttpSession session, HttpServletResponse rs) throws IOException {
        // String securityCode = ValidateImageCodeUtils.getSecurityCode();
        // System.out.println(securityCode);
        // BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        // ImageIO.write(image,"png",new FileOutputStream("aa.png"));
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        session.setAttribute("securityCode", securityCode);
        ServletOutputStream os = rs.getOutputStream();
        ImageIO.write(image, "png", os);

    }
}
