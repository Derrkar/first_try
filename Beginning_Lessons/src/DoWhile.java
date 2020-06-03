import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
      /*  System.out.println("введи 5");  Дублирование кода
        int value = scanner.nextInt();
        while(value!=5){
            System.out.println("введи 5");
            value = scanner.nextInt();
        } */
        int value; // Когда мы декларируем переменную она видно только в пределах {}
        do{
            System.out.println("Введи 5 ");
            value = scanner.nextInt();
        } while(value!=5);
        System.out.println("Вы ввели 5");
    }
}
