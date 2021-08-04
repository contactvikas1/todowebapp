package com.technovihaan.jee.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(urlPatterns = "/deletetodo.do")
public class DeleteTodoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        TodoService todoService = new TodoService();
        String name = request.getParameter("todo");
        String category = request.getParameter("category");
        List<Todo> todoList = todoService.deleteTodo(name, category);
        request.setAttribute("todo", todoList);
        response.sendRedirect("/list-todo.do");

    }
}