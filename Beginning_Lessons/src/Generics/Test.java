package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ////////////////////////////////// Java 5 //////////////////////////////////

        List animals = new ArrayList(); // ArrayList - class, List - interface
        // обьекты класса ArrayList рассматривються как обьекты класса Object(ArrayList хранит обьекты класса Object)
        Animal ourAnimal = new Animal();
        ourAnimal.name = "Shit";
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);
        Animal ourAnimall = (Animal)animals.get(3);
        System.out.println(ourAnimall);

        String animal = (String)animals.get(1); // Downcasting from Object to String
        System.out.println(animal);

        /////////////////////////////  С появлением дженериков /////////////////////////////

        List<String> animals2 = new ArrayList<String>();
        // Теперь в классе ArrayList находятся обьекты класса String
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        ///////////////////////////// Java 7 /////////////////////////////

        List<String> animals3 = new ArrayList<>();
    }




    }

class Animal{
    public String name;
    public int age;

}
