package dev.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.web.model.User;

@RequestMapping("/add")
public String first (HttpServletRequest request, HttpServletResponse response) {
	String name = request.getParameter("name");
	String author = request.getParameter("author");
	
	System.out.println(name);
	System.out.println(author);
	
	return "mypage.jsp";
	
	}
}
