public class Dog extends Animal { // в этом случае класс Dog наследуется от класса Animal(Animal родитель класса Dog)

    public void eat(){
        System.out.println("Dog is eating");
    }

    public void bark(){
        System.out.println("Dog is barking");
    }

    public void showName(){
        System.out.println(name);
    }

}
