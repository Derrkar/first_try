import java.util.Scanner;
// java.lang - класс String лежит в пакете lang (Все классы пакета java.lang импортируются по умолчанию)
// java.util - класс Scanner лежит в пакете lang
public class Input {
    public static void main(String[] args) {
        String a = new String("makslfklajfas");// new - создание нового обьекта класса
        Scanner s = new Scanner(System.in); // ВХодной поток (Стандартный поток входных данных)
        System.out.println("введите, какое-нибудь число  ");
        //   String string = s.nextLine();  nextLine - метод обьекта s класса Scanner
        int x = s.nextInt(); // nextInt - метод обьекта x класса Scanner
        System.out.println("вы ввели "+x);
    }
}
