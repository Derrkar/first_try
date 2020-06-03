package Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimals);
        test(listOfDogs);

        /*
             Object
             Animal
              Dog
         */
    }


    private static void test(List<? extends Animal> list){ // ? - обозначает то, что в этот метод можно передать List любых объектов(это называется Wildcards)
        // ? extends Animal обозначает то, что в этот метод можно передать List любых объектов класса Animal и всех классов которые его наследуют
        // extends Animal - class Animal and all who extends Animal, including Animal(Animal and Dog)
        // super Dog - class Dog and all who is above Dog, including Dog(Dog, Animal, Object)
        for(Animal animal : list) {
            System.out.println(animal);
            Animal.eat();
        }
    }
}
