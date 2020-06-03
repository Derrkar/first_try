package Enum;
// Enum используется для перечисления объектов
public class Test {

    public static void main(String[] args) {
        /*Animal animal = Animal.CAT; // CAT ведет себя как статическая переменная
        System.out.println(animal.getTranslation());
        System.out.println(animal.toString());*/


        /* switch(animal) {
            case CAT:
                System.out.println("It's a cat");
                break;
            case DOG:
                System.out.println("It's a dog");
                break;
        } */

        /*Season season = Season.WINTER;
        System.out.println(season.getTemperature());*/
        // Object -> Enum -> Season иерархия классов

        /* System.out.println(season instanceof Enum ); // ключевое слово instanceof проверяет являится ли объект, объектом этого класса
        System.out.println(season.getClass()); // возвращает класс объекта

        switch (season) {
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
        } */
                                             // Methods of Enum //
        Season season = Season.AUTUMN;
        Animal animal = Animal.CAT;
        System.out.println(season.name()); // метод name возвращает название объекта Enum в виде строки
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG"); // метод valueOf, для того что бы из строки получить Enum
        System.out.println(frog.getTranslation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal()); // method ordinal return index of object
    }
}
