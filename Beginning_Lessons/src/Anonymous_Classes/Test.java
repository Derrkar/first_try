package Anonymous_Classes;

/* class Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }
} */

interface AbleToEat {
    public void eat();
}

/*  class Animal implements AbleToEat{

    @Override
    public void eat() {
        System.out.println("asd");
    }
} */
public class Test {
    public static void main(String[] args) { /*
        Animal animal = new Animal();
        animal.eat();

        Animal animal1 = new Animal(){ // создание анонимного класса, внутри Animal создается класс, который наследуется от Animal и который переопределяет метод eat()
            // переменная animal1 - это переменная типа Animal и является не объектом класса Animal, а объектом класса(без названия(анонизмный)), который наследуется от класса Animal и имеет переопределенный метод eat()
          public void eat(){
              System.out.println("Other animal is eating...");
          }
        };

        animal1.eat();
      */
  //  AbleToEat ableToEat = new Animal();
  //  ableToEat.eat();
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };

        ableToEat.eat();
    }
}
