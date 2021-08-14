package com.technovihaan.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private static List<Todo> todoList = new ArrayList<Todo>();

    static {
        todoList.add(new Todo("K8 and Docker"));
        todoList.add(new Todo("Let Us C"));
        todoList.add(new Todo("Kotlin"));
        todoList.add(new Todo("Go Language"));
    }

    public List<Todo> retrieveTodo() {
        return todoList;
    }

    public void addTodo(String name) {
        todoList.add(new Todo(name));
    }
    public void deleteTodo(String name){
        todoList.remove(new Todo(name));
    }
}
