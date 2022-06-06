package com.github.sats17.servlet.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomDispatcher extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4713782151358274708L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String uri = req.getRequestURI();
		System.out.println(uri);
//		Long id = Long.parseLong(uri.substring("/todos/".length()));
		System.out.println("Hi there");
//		String json = GSON.toJson(Todos.todos.get(id));

		resp.setStatus(200);
		resp.setHeader("Content-Type", "application/json");
		resp.getOutputStream().println("Returning from raw servlet");
		System.out.println(resp);
	}
	
}
