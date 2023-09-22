package lesson_1;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,4);
        }
        System.out.println(Arrays.toString(array));
        int left = 0;
        int right = array.length-1;
        while (left < right){
            if (array[left] == 3 && array[right] != 3){
                array[left] = array[right];
                array[right] = 3;
                left++;
                right--;
            }
            else if (array[right] == 3) {
                right--;
            }
            else if (array[left] != 3){
                left++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
