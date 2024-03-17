import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.List;
public class TelephoneBook {
    public static void main(String[] args) {
        Map<String, Set<String>> phoneBook = new HashMap<>();

        // Заполнение телефонной книги
        phoneBook.computeIfAbsent("Иванов", k -> new HashSet<>()).add("111-1111");
        phoneBook.computeIfAbsent("Петров", k -> new HashSet<>()).add("222-2222");
        phoneBook.computeIfAbsent("Сидоров", k -> new HashSet<>()).add("333-3333");
        phoneBook.computeIfAbsent("Иванов", k -> new HashSet<>()).add("444-4444");
        phoneBook.computeIfAbsent("Сидоров", k -> new HashSet<>()).add("555-5555");

        // Создание списка для сортировки и вывода телефонов
        List<Map.Entry<String, Set<String>>> sortedPhoneBook = new ArrayList<>(phoneBook.entrySet());
        sortedPhoneBook.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        // Вывод телефонной книги (отсортированный по убыванию числа телефонов)
        for (Map.Entry<String, Set<String>> entry : sortedPhoneBook) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}