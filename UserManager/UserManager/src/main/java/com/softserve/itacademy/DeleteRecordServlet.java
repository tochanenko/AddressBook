package com.softserve.itacademy;

import com.softserve.itacademy.entity.AddressBook;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/records/delete")
public class DeleteRecordServlet extends HttpServlet {

    private AddressBook book;

    @Override
    public void init() {
        book = AddressBook.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (!book.delete(request.getParameter("first-name"), request.getParameter("last-name"))) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        response.sendRedirect("/records/list");
    }
}
