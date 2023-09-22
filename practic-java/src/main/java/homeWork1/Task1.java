package homeWork1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
            boolean isPrime;
            for(int i = 1; i < 15; i++) {
                isPrime = i == 1;
                for(int j = 2; j < 15; j++) {
                    if (i >= j && i % j == 0) {
                        if(j == i) {
                            isPrime = true;
                        }
                        break;
                    }
                }
                if(isPrime) System.out.println(i);
            }
    }
}



