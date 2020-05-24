package com.softserve.itacademy;

import com.softserve.itacademy.entity.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/records/delete")
public class DeleteUserServlet extends HttpServlet {

    private UserDao userDao;

    @Override
    public void init() {
        userDao = UserDao.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userDao.delete(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect("/users/list");
    }
}
