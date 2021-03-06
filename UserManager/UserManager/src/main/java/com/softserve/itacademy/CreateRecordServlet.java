package com.softserve.itacademy;

import com.softserve.itacademy.entity.AddressBook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/records/create")
public class CreateRecordServlet extends HttpServlet {

    private AddressBook book;

    @Override
    public void init() {
        book = AddressBook.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstName = request.getParameter("first-name");
        String lastName = request.getParameter("last-name");
        String address = request.getParameter("address");

        if (!book.create(firstName, lastName, address)) {
            request.setAttribute("first-name", firstName);
            request.setAttribute("last-name", lastName);
            request.setAttribute("address", address);

            request.getRequestDispatcher("/WEB-INF/create-record.jsp").forward(request, response);

            return;
        }

        response.sendRedirect("/records/list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/create-record.jsp").forward(request, response);
    }
}
