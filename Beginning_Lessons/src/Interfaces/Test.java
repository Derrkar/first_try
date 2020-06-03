package Interfaces;

public class Test {
    public static void main(String[] args) {
        /* Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo(); */
        // Мы рассматриваем обьект класса Animal, не как обьект класса Animal, а как нечто, что реализует интерфейс Info
        /* Info info1 = new Animal(1); // Переменная info1 типа данных Info ссылается на обьект класса Animal, это возможно только потому, что класс Animal имплементирует интерфейс Info
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2); */
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        outputInfo(animal1);
        outputInfo(person1);
    }

    public static void outputInfo(Info info){ // Метод outputInfo может действовать на любом из обьектов, класс которго реализует интерфейс Info
        // В этот метод в качевстве аргументов мы можем подать либо Animal, либо Person
        info.showInfo();
    }

}
