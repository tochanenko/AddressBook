package com.softserve.itacademy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users/update")
public class UpdateUserServlet extends HttpServlet {

    private UserDao userDao;
    private User user;

    @Override
    public void init() throws ServletException {
        userDao = UserDao.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        userDao.update(user.getId(), user);
        response.sendRedirect("/users/list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        user = userDao.read(Integer.parseInt(request.getParameter("id")));

        request.setAttribute("user", user);
        request.getRequestDispatcher("/WEB-INF/update-user.jsp").forward(request, response);
    }
}
