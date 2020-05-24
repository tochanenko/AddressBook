package com.softserve.itacademy;

import com.softserve.itacademy.entity.AddressBook;
import com.softserve.itacademy.entity.SortOrder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/records/list")
public class RecordListServlet extends HttpServlet {

    private AddressBook book;

    @Override
    public void init() {
        book = AddressBook.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/record-list.jsp");

        String sorted = request.getParameter("sort");

        if (sorted != null) {
            if (sorted.equals("asc"))
                book.sortedBy(SortOrder.ASC);
            else if (sorted.equals("desc"))
                book.sortedBy(SortOrder.DESC);
            else {
                response.sendError(HttpServletResponse.SC_NOT_FOUND);
                return;
            }
        }

        request.setAttribute("book", book);
        requestDispatcher.forward(request, response);
    }
}
