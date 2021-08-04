package com.technovihaan.jee.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/view/add-todo.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        TodoService todoService = new TodoService();
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        List<Todo> todoList = todoService.addTodo(name, category);
        request.setAttribute("todo", todoList);
        response.sendRedirect("/list-todo.do");

    }
}