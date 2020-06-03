package Serialization_Deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write_Object {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("People.bin"))) { // try with resources
           // FileOutputStream fos = new FileOutputStream("people.bin");
            // класс FileOutPutStream предназначен для записи последовательности байтов
          // ObjectOutputStream oos = new ObjectOutputStream(fos); // при записи объектов в файл сначала ObjectOutputStream запишет их как объекты
            // вызовет в конструкторе FileOutputStream и тот отформатирует их в бинарный код, в конструкторе вызовет people.bin и запишете его туда
            // класс ObjectOutPutStream предназначен исключительно для записи объектов файла
            oos.writeObject(person1);

           // oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
