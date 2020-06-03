package Polymorphism;

public class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("Dog is eating..."); // Поздние связывание(если в main вызвать метод eat(), то будет вызыватся метод eat(), который мы здесь переопределили)
    }

    public void bark(){
        System.out.println("Dog is barking..");
    }
}
