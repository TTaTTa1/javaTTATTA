import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем HashMap для хранения телефонной книги
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        // Входные данные
        phoneBook.put("Иванов", Arrays.asList("123456", "654321"));
        phoneBook.put("Петров", Arrays.asList("987654"));
        phoneBook.put("Сидоров", Arrays.asList("555555", "666666", "777777"));
        phoneBook.put("Иванов", Arrays.asList("888888"));

        // Создаем список записей из HashMap
        List<Map.Entry<String, List<String>>> list = new ArrayList<>(phoneBook.entrySet());

        // Сортируем список по убыванию количества телефонных номеров
        list.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        // Выводим отсортированный список
        for (Map.Entry<String, List<String>> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
