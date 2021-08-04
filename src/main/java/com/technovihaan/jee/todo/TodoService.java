package com.technovihaan.jee.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private static List<Todo> todoList = new ArrayList<Todo>();

    static {
        todoList.add(new Todo("K8 and Docker", "Tech"));
        todoList.add(new Todo("Let Us C", "Tech"));
        todoList.add(new Todo("Kotlin", "Tech"));
        todoList.add(new Todo("Go Language", "Tech"));
    }

    public List<Todo> retrieveTodo() {
        return todoList;
    }

    /**
     * Add in todo list
     *
     * @param name
     * @return
     */
    public List<Todo> addTodo(final String name, final String category) {
        todoList.add(new Todo(name, category));
        return todoList;
    }

    public List<Todo> deleteTodo(String name, final String category) {
        Todo todo = new Todo(name, category);
        todoList.remove(todo);
        return todoList;
    }
}
