package com.java.stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(5);
        stack.push("Ali");
        stack.push("Ahmed");
        stack.push("said");
        stack.pop();
        stack.push("Ahmed");
        stack.push("said");
        stack.push("Helmy");
        stack.print();

    }
}