package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Read_Array_of_Objects {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("People.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

                                               // 1 method //
           /* int personCount = ois.readInt();
            Person[] people = new Person[personCount];
            for(int i = 0; i < personCount; i++) {
                people[i] = (Person) ois.readObject();
            }

            System.out.println(Arrays.toString(people)); */
                                               // 2 method //
            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) { // в том случаи, когда в проекте нету того класса, объекты которого записаны в файле, который мы считываем
            e.printStackTrace();
        }
    }
}
