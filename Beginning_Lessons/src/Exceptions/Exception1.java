package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args){ //throws FileNotFoundException { - это значит, что наш метод main выбросит исключение FileNotFoundException
        // Мы должны как-то обработать тот сценарий, в котором этот файл не существует
        File file = new File("sadasd");
        try { // - блок try(попытайся сделать то, что в {}, если не удается переходим в catch(){} )
            Scanner scanner = new Scanner(file); // - это код, который может вызвать исключение
            // Если исключение выбрасывается, то все что после этого в этом блоке не выполняется
            System.out.println("После Scanner'a");
        } catch (FileNotFoundException e) { // - catch - блок для обработки исключения, e - объект класса FileNotFoundException, который выброшен в результате некоторектного выполнения кода в try{}
          // e.printStackTrace(); - по умолчанию вызываем метод printStackTrace() (Это то, что java стандартно выводит в сообщение об ошибке)
            // В try - catch блоках хорошо то, что мы можем реализовать свйо метод обработки исключения
            System.out.println("Файл не найден");
        }

        System.out.println("После блока try - catch");
        // Все классы, которые в java обозначают исключение должны наследоватся от класса Exception
        readFIle();
    }

    public static void readFIle() {
        // Наша исключение выбросится в этом методе, но у всех методов, которые вызывают этот метод мы должны также обработать это исключение
        File file1 = new File("klajd");
        try {
            Scanner scanner1 = new Scanner(file1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден в методе readFIle");
        }
    }
}
