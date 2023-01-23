package com.js.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BookCRUD;
import com.js.dto.Book;
@WebServlet(value="/view")
public class ViewAllBooks extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BookCRUD bc = new BookCRUD();
		ArrayList<Book> books = bc.getAllBooks();
		if (books.isEmpty()) {
			RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "NO BOOKS AVAILABLE");
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("viewall.jsp");
			req.setAttribute("data", books);
			rd.forward(req, resp);

		}
	}
}
