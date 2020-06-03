package ArrayList;
// Все классы java collection лежат в пакете java.util

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // за конвенцией нужно ссылать объект класса на интерфейс, который этот класс реализует

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        // мы проводим много удалений из нашего листа
        list = new LinkedList<>();

        System.out.println(list);
        System.out.println(list.get(0)); // get - возвращает елемент по индексу в массиве
        System.out.println(list.size()); // size - return size of ArrayList

                                    // Пройтись по всем елементам ArrayList //
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer x : list) {
            System.out.println(x);
        }

        list.remove(5); // если удаление по середине или ближе к началу, то remove работает плохо, потому что удаляет елемент по индексом, а все отсальные елементы перемещает
        // на один влево после чего уменшает размер массива на 1(это очень долго), в этом случае лучше отказаться от ArrayList и создать LinkedList
        System.out.println(list);


    }
}
