package org.example;

class CyclicDoublyLinkedList {
    public Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head.prev;
            newNode.next = head;
            head.prev = newNode;
            last.next = newNode;
            newNode.prev = last;
        }
    }

    public void sumElements(int K) {
        if (head == null) {
            return;
        }

        int sum = 0;
        Node current = head;
        boolean reachedK = false;

        do {
            sum += current.data;
            System.out.print(current.data + " ");
            if (sum >= K) {
                reachedK = true;
                break;
            }
            current = current.next;
        } while (current != head);

        if (reachedK) {
            System.out.println("\nСумма достигла K: " + sum);
        } else {
            System.out.println("\nСумма не достигла K, к сожалению: " + sum);
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        do {
            sb.append(current.data);
            current = current.next;
            if (current != head) {
                sb.append(", ");
            }
        } while (current != head);
        sb.append("]");
        return sb.toString();
    }
}