package com.softserve.itacademy;

import com.softserve.itacademy.entity.AddressBook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/records/read")
public class ReadUserServlet extends HttpServlet {

    private AddressBook book;

    @Override
    public void init() {
        book = AddressBook.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("first-name");
        String lastName = request.getParameter("last-name");

        String address = book.read(firstName, lastName);

        if (address == null) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        request.setAttribute("first-name", firstName);
        request.setAttribute("last-name", lastName);
        request.setAttribute("address", address);

        request.getRequestDispatcher("/WEB-INF/read-user.jsp").forward(request, response);
    }
}
