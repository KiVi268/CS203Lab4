package com.kivi;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addToFront("Third");
        list.addToFront("Second");
        list.addToFront("First");

        list.addToBack("Fourth");
        list.addToBack("Fifth");

        System.out.println("List contents:\n" + list);

        System.out.println("Item at index 2: " + list.get(2));

        list.remove(1);
        System.out.println("After removing index 1:\n" + list);

        System.out.println("Size of list: " + list.size());


        list.addToFront("a");
        list.addToBack("b");
        list.addToBack("b");
        list.addToBack("a");

        System.out.println("Is the list a palindrome? " + list.isPalindrome());

        list.addToBack("c");
        System.out.println("Is the list a palindrome? " + list.isPalindrome());

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack size after pushes: " + stack.size());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack size after pops: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Is stack empty after clearing? " + stack.isEmpty());

        list.clear();
        System.out.println("After clearing the list:\n" + list);
        System.out.println("Size of list after clear: " + list.size());
    }
}