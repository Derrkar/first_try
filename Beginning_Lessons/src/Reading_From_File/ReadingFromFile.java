package Reading_From_File;

import java.awt.*;
import java.io.File; // В пакете java.io находится большинство классов для работы с вводом/выводом данных
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator+ "C:" +separator+ "Users" +separator+ "Євген" +separator+ "Desktop" +separator+ "test.txt";
      //  File file = new File("C:\\Users\\Євген\\Desktop\\test.txt");
        File file = new File(path);
        File file2 = new File("test2"); // Так можно указывать путь, если файл лежит в корневой папке проекта
        Scanner scanner = new Scanner(file); // System - стандартный класс java, in - константа, в которой находится стандартный поток ввода(поток, который открывается для считывания данных из консоли)
      //  while(scanner.hasNextLine()){
      //      System.out.println(scanner.nextLine());
      //  }
        String line = scanner.nextLine();
        String[] numbersString = line.split(" "); // split разделяет строку
        int[] numbers = new int[3];
        int counter = 0;

        for(String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers)); // Метод Arrays.toString() возвращает строковое представление одномерного массива, разделяя элементы запятой.
        // Поток - такая штука в который есть вход и выход
        // Scanner считывает эти данные
        Scanner scanner2 = new Scanner(file2);
        String line2 = scanner2.nextLine();
        System.out.println(line2);

        scanner.close();
    }
}
