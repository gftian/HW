package com.kkb.controller;

import com.alibaba.fastjson.JSONObject;
import com.kkb.bean.JSONMessage;
import com.kkb.bean.Message;
import com.kkb.util.Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userInfo")
public class UserInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/json;charset=utf-8");
        Object user = Application.get("user");
        JSONMessage msg = new JSONMessage(0,"ok",user);
        response.getWriter().append(msg.toJSON());
    }
}
