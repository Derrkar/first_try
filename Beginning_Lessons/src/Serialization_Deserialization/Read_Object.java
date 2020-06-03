package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read_Object {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("People.bin "))){ // это try with resources - когда запись идет до блока try
           // FileInputStream fis = new FileInputStream("People.bin");
           // ObjectInputStream ois = new ObjectInputStream(fis);
            Person person1 = (Person)ois.readObject(); // метод readObject возвращает родителя всех классов в java объект класса Object, для того что бы получить объект тоего класса, нужно сделать downcasting до твоего класса
            System.out.println(person1);
          // ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) { // в том случаи, когда в проекте нету того класса, объекты которого записаны в файле, который мы считываем
            e.printStackTrace();
        }
    }
}
