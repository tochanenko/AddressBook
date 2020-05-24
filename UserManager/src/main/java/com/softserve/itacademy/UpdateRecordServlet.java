package com.softserve.itacademy;

import com.softserve.itacademy.entity.AddressBook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/records/update")
public class UpdateRecordServlet extends HttpServlet {

    private AddressBook book;
    String firstName;
    String lastName;

    @Override
    public void init() {
        book = AddressBook.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (!book.update(
                firstName,
                lastName,
                request.getParameter("address")
        )) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        response.sendRedirect("/records/list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        firstName = request.getParameter("first-name");
        lastName = request.getParameter("last-name");

        String address = book.read(firstName, lastName);

        if (address == null) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        request.setAttribute("first-name", firstName);
        request.setAttribute("last-name", lastName);
        request.setAttribute("address", address);
        request.getRequestDispatcher("/WEB-INF/update-record.jsp").forward(request, response);
    }
}
