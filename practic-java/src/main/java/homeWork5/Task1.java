package homeWork5;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("89995255620", "PETROV");
        phoneBook.put("89995252262", "VASILIEV");
        phoneBook.put("89995346789", "PETROV");
        phoneBook.put("89995255623", "IVANOV");
        phoneBook.put("89995255624", "IVANOV");
        phoneBook.put("89995255625", "IVANOV");

        System.out.printf("Введите одну из команд:%n" +
                "ADD добавить контакт%n" +
                "GET посмотреть контакт%n" +
                "REMOVE удалить контакт%n" +
                "LIST показать все контакты%n" +
                "EXIT выйти из телефонного справочника%n");
        while (true) {
        String input = scanner.nextLine();

                if (input.equalsIgnoreCase("ADD")) {
                    addNewValue(phoneBook, scanner);
                    System.out.println(phoneBook);
                    continue;
                }

                else if (input.equalsIgnoreCase("GET")) {
                    System.out.println("Введите фамилию для поиска номера(-ов): ");
                    String surname = scanner.next();
                    boolean hasValue = phoneBook.containsValue(surname);
                    if (hasValue == true) {
                        getPhone(phoneBook, surname);
                    } else {
                        System.out.println("Не найдена запись с фамилией " + surname);
                    }
                    continue;
                }

                else if (input.equalsIgnoreCase("REMOVE")) {
                    System.out.println("Введите фамилию для удаления всех номеров: ");
                    String surname = scanner.next();
                    boolean hasValue = phoneBook.containsValue(surname);
                    if (hasValue == true) {
                        removePhone(phoneBook, surname);
                    } else {
                        System.out.println("Не найдена запись с фамилией " + surname);
                    }
                    continue;
                }

                else if (input.equalsIgnoreCase("LIST")) {
                    listContact(phoneBook);
                    continue;
                }

                else if (input.equalsIgnoreCase("EXIT")) break;
        }
    }

    private static void listContact(Map<String, String> phoneBook) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("%s -> %s%n", key, value);
        }
    }

    private static void getPhone(Map<String, String> phoneBook, String surname) {
        for (Map.Entry<String, String> entry: phoneBook.entrySet()) {
            if (surname.equals(entry.getValue())) {
                System.out.printf("%s%n", entry.getKey());
            }
        }
    }
    private static void removePhone(Map<String, String> phoneBook, String surname) {
        for (Map.Entry<String, String> entry: phoneBook.entrySet()) {
            if (surname.contains(entry.getValue())) {
                if (surname.equals(entry.getValue())) {
                    phoneBook.values().removeAll(Collections.singleton(surname));
                    System.out.println(phoneBook);
                    return;
                }
            }

        }
    }

    private static void addNewValue(Map<String, String> phoneBook, Scanner scanner) {
        System.out.println("Введите фамилию: ");
        String surname = scanner.next();
        System.out.println("Введите номер телефона: ");
        String number = scanner.next();
        if (phoneBook.containsKey(number)){
            System.out.println("Такой номер телефона уже привязан к другому пользователю!");
        } else {
            phoneBook.put(number, surname);
        }
    }

}
