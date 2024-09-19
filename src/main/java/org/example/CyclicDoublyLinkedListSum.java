package org.example;

import java.util.Scanner;

public class CyclicDoublyLinkedListSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число K: ");
        int K = scanner.nextInt();

        System.out.print("Введите элементы последовательности, заканчивая её точкой: ");
        CyclicDoublyLinkedList list = new CyclicDoublyLinkedList();
        String input;
        do {
            input = scanner.next();
            if (!input.equals(".")) {
                list.insert(Integer.parseInt(input));
            }
        } while (!input.equals("."));

        if (list.head == null) {
            System.out.println("\nСписок пуст.");
        } else {
            System.out.println("\nИсходная последовательность: " + list);
            list.sumElements(K);
        }
    }
}
