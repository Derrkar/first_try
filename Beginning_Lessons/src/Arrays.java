// Все типы данных в java делятся на типа: примитивные и ссылочные
public class Arrays {
    public static void main(String[] args){
        /* int number = 10; примитивный тип данных
        char character = 'a'; примитивный дип данных
        String s = "Hello"; String - класс; s - имя переменной; "Hello" - обьект класса String
        String s1 = new String("Hello"); new - создает новый обьект класса
        обьекты s и s1 указывают на слово "Hello", а number и character содержат значения 10 и 'a' (коробки) */
        int number = 10; //                  [10]             примитивный тип данных
        int[] numbers = new int[5]; // numbers -> [массив]    ссылочный тип данных
        // java по умолчанию инициализирует массив целых чисел нулями
        for(int i = 0; i<numbers.length; i++){ // numbers.length - длина массива
            numbers[i] = i*10;
        }
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1,2,3};
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
