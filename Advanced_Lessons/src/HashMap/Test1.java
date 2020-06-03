package HashMap;
// HashMap нужно использовать, когда неважен поряд пар ключ,значение (нужно только наличие пар)

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        // 1 -> [.. .. ..] 1 - ключ, [] - значения
        // 2 -> [.. .. ..] 2 - ключ, [] - значения
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        map.put(4, "Четыри");
        map.put(5, "Пять");
        map.put(6, "Шесть");
        map.put(7, "Семь");

        for (Map.Entry<Integer, String> entry : map.entrySet()) { // entry - объект класса Entry (pair of key and value)
            // entrySet() возвращает набор всех пар ключ,значение в этой map (возвращает все объекты класса Entry, которые находяться в map
            System.out.println(entry.getKey() + " : " + entry.getValue()); // getKey() return key of this entry and getValue() return value of this entry
        }
    }
}
