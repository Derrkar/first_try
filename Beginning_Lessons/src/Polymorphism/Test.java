package Polymorphism;

public class Test {
    public static void main(String[] args) {
      /*  Animal animal = new Dog(); // Мы к обьекту класса Dog можем обращатся через переменную родительського типа
        animal.eat(); // animal.bark() не будет работать потому что, если создавать обьект обращаясь к родительському типу нам будут доступны только методы родителя */

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal){ // благодаря правильной наследственной связи и палиморфизму мы создали всего лишь 1 метод и вызвали его на 3 разных обьекта(экономля место и память)
        animal.eat();
    }
}
