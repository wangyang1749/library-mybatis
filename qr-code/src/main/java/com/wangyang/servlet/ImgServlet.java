package com.wangyang.servlet;

import org.w3c.dom.css.RGBColor;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/img")
public class ImgServlet extends HttpServlet {
   Random random  = new Random(2);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BufferedImage image = new BufferedImage(100, 100,
                BufferedImage.TYPE_INT_RGB);
        System.out.println(random.nextInt(2));
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                image.setRGB(x, y, random.nextInt()==0? 0xFFFFFFFF: 0x111);
            }
        }
        ImageIO.write(image, "jpg", resp.getOutputStream());
    }
}
