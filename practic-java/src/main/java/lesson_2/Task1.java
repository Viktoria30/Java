package lesson_2;

public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        char c1 = 'a';
        char c2 = 'b';
        String result = getString(n, c1, c2);
        System.out.println(result);
    }

    private static String getString(int n, char c1, char c2) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                str.append(c1);
            }
            else {
                str.append(c2);
            }
        }
        return str.toString();
    }
}
