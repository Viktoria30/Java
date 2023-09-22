package lesson_2;

public class Task2 {
    public static void main(String[] args) {
        String str = "aaaabbbcddfg";
        System.out.print(compressString(str));
    }

    // Напишите метод, который сжимает строку.
    //Пример: вход aaaabbbcdd.
    //a4b3cd2
    public static String compressString(String str) {
        int counter = 1;
        StringBuilder compressed = new StringBuilder();
        char current = '0';

        for (int i = 1; i < str.length(); i++) {
            current = str.charAt(i-1);
            if (str.charAt(i-1) == str.charAt(i)) {
                counter++;
            }
            else{
                if (counter == 1) {
                    compressed.append(current);
                }
                else {
                    compressed.append(current).append(counter);
                }
                counter = 1;
            }


        }
        if (counter >1) {
            compressed.append(current).append(counter);
        }
        else if (counter == 1) {
            compressed.append(str.charAt(str.length() - 1));
        }
        return compressed.toString();
    }
}
