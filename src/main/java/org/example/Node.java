package org.example;

public class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = this;
        this.next = this;
    }
}
