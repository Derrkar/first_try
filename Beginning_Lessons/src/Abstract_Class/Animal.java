package Abstract_Class;

public abstract class Animal {
    public void eat(){
        System.out.println("I am eating...");
    }

    public abstract void makeSound(); // в абстрактных методах нету реализации, поэтому мы обязаны в классах наследниках реализовать все методы абстрактного родителя

}
