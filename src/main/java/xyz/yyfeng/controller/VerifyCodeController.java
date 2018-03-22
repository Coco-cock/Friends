package xyz.yyfeng.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.yyfeng.util.VerifyCodeUtil;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Component
@RequestMapping("/")
public class VerifyCodeController {
    @RequestMapping("/getValidateCode")
    public void  etValidateCode(HttpServletRequest req, HttpServletResponse repo){
        repo.setHeader("Pragma", "no-cache");
        repo.setHeader("Cache-Control", "no-cache");
        repo.setDateHeader("Expires", 0);
        String verifyCode = VerifyCodeUtil.generateTextCode(VerifyCodeUtil.TYPE_NUM_LOWER, 4, null);
        //将验证码放到HttpSession里面
        req.getSession().setAttribute("verifyCode", verifyCode);
        //设置输出的内容的类型为JPEG图像
        repo.setContentType("image/jpeg");
        BufferedImage bufferedImage = VerifyCodeUtil.generateImageCode(verifyCode, 90, 30, 3, true, Color.WHITE, Color.BLACK, null);
        //写给浏览器
        try {
            ImageIO.write(bufferedImage, "JPEG", repo.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

