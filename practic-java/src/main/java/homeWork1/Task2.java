package homeWork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        double result = 0;
        int a = 3;
        int b = 5;
        String op = "/";

        switch (op) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> {
                if(b != 0) result = a / b;
                else{
                    System.out.println("Некорректные данные, делить на ноль нельзя");
                }
            }
            default -> {
                System.out.println("Некорректный оператор: '" + op + "'");
                break;
            }
        }
        System.out.println(result);
    }
}

