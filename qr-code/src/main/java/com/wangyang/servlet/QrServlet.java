package com.wangyang.servlet;

import com.wangyang.qr.QRCodeUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/qr")
public class QrServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        if(name==null){
            name="156230";
        }

        try {
            QRCodeUtil.encode(name,resp.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
