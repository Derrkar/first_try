package Serialization_Deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write_Array_of_Objects {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom")};
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            // класс FileOutPutStream предназначен для записи последовательности байтов
            ObjectOutputStream oos = new ObjectOutputStream(fos); // при записи объектов в файл сначала ObjectOutputStream запишет их как объекты
            // вызовет в конструкторе FileOutputStream и тот отформатирует их в бинарный код, в конструкторе вызовет people.bin и запишете его туда
            // класс ObjectOutPutStream предназначен исключительно для записи объектов файла
                                                   // 1 method //
           /* oos.writeInt(people.length);

            for(Person person : people) {
                oos.writeObject(person);
            } */
                                                    // 2 method //
            oos.writeObject(people);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
