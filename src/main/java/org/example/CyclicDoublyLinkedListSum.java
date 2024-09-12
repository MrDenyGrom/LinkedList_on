package org.example;

import java.util.Scanner;

public class CyclicDoublyLinkedListSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число K: ");
        int K = scanner.nextInt();

        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();

        CyclicDoublyLinkedList list = new CyclicDoublyLinkedList();

        System.out.println("Введите элементы последовательности: ");
        for (int i = 0; i < n; i++) {
            list.insert(scanner.nextInt());
        }

        System.out.println("\nИсходная последовательность: " + list);
        list.sumElements(K);
    }
}
