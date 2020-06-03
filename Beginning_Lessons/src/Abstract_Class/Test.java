package Abstract_Class;
// интерфейс - это то что класс умеет делать, а абстрактный класс это то, чем класс является

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
    }
}
