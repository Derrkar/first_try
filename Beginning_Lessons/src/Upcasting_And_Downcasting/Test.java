package Upcasting_And_Downcasting; // Восходящие и нисходящие преобразования

public class Test {
    public static void main(String[] args) {

        // Upcasting - Восходящее преобразование

        Animal animal = new Dog(); // Восходящее преобразование от наследника new Dog к ородителю Animal(Dog рассматриваем как Animal)
        // Сверху тоже самое что и снизу
        Dog dog = new Dog();
        Animal animal1 = dog;
         // Восходящее преобразование(dog стала animal), Upcasting происходит неявно(java сама делает восходящее преобразование)

        // Downcasting - Нисходящее преобращование(Downcasting происходит явно)

        Dog dog2 = (Dog) animal;
        dog2.bark();

        // Dog doggy = (Dog) a - эти преобразования не меняют обьект, они меняют ссылку на этот обьект


    }
}
