public class Arrays_of_Strings {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "Джава";
        //System.out.println(strings[0]);
        //System.out.println(strings[2]);
        for(int i = 0; i<strings.length; i++){
            System.out.println(strings[1]);
        }
        System.out.println();
        // for each - для каждого
        for(String str:strings){ // String - тип данных(строка), str - имя переменной, strings - массив через который хотим проходить
            System.out.println(str);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for(int x:numbers1){
            sum = sum+x; // тоже самое что sum += x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
        String s = null; // s по умолчанию указывает на null(ничего)
        System.out.println();
        System.out.println(s);
    }
}
