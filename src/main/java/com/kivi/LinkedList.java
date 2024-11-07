package com.kivi;

import java.util.Stack;

public class LinkedList<T> {
    private Node<T> head;
    protected int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void addToFront(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addToBack(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isPalindrome() {
        if (head == null || size <= 1) {
            return true;
        }
        Stack<T> stack = new Stack<>();
        Node<T> current = head;

        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        current = head;
        while (current != null) {
            if (!current.data.equals(stack.pop())) {
                return false;
            }
            current = current.next;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            result.append(current.data).append("\n");
            current = current.next;
        }
        if (!result.isEmpty()) {
            result.setLength(result.length() - 1);
        }
        return result.toString();
    }

    private static class Node<T> {
        private final T data;
        private LinkedList.Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}