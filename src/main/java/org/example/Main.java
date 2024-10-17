package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            String[] names = scanner.nextLine().split(" ");
            int index = scanner.nextInt();
            System.out.println(names[index]);
        }catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Invalid position or Input error");
        }

        scanner.close();

    }





}