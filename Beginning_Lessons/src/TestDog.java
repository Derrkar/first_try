public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.showName();
        dog.sleep();
        dog.eat();
        dog.name = "Ara";
        dog.showName();
    }
}
