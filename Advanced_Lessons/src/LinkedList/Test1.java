package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        // самым первым в LinkedList стоит елемент head
        // head -> [5] -> [1] -> [2] -> [3] -> [4] - цепочка объектов, каждый объект называеться узлов, в каждом узле есть значение узла и ссылка на следующий узел
        // у узлов нету индексов, по-этому когда мы обращаемся к узлу [4], java проходит от [1] к [2], потом к [3] и потом к [4]

        List<Integer> arrayList = new ArrayList<>(); // хранит информацию во внутренном массиве
        // [7][6][1][2][3][4][5]

                            // compare speed of working linked and array lists //
        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {

        long start = System.currentTimeMillis(); // возвращает текущее время работы системы в милисекундах

        for(int i = 0; i < 100000; i++){
            list.add(0, i); // в этом случае метод add добавляет аргумент i в индекс 0, а все остальные значиния смещает вправо
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
