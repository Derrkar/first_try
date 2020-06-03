package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        // Checked Exception(Compile time exception) - Исключения, которые возникают во время компиляции(Исключительные случаи в работе программы)
        // Unchecked Exception(Runtime exception) - Исключения, которые возникают во время выполнения программы(Ошибки в ходе программы)

       // int a = 1/0;
       // String name = null;
       // name.length();
        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
