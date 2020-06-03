import javax.xml.namespace.QName;

public class Lesson20 {
    public static void main(String[] args) {
        // Human1 human1 = new Human1("Bob", 30);
        // human1.setName("Tom");
        // Human1.getDescription();
        Human1 h1 = new Human1("Bob", 40);
        Human1 h2 = new Human1("Tom", 30);
        /* Human1.description = "Nice";
        h1.getAllFields();
        h2.getAllFields();
        Human1.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();
        // System.out.println(Math.pow(2,4));
        // System.out.println(Math.PI); */
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human1 h3 = new Human1("Rob", 50);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();
        h1.toString(); // toString - возвращает hash code для созданого обьекта(hash code - метод, позволяющий получить уникальный целый номер для данного обьекта)
        System.out.println(h1);
        // Всегда когда мы вызываем методы: println, printf, print etc, все эти методы скрыто от нас обращаются и вызывают метод toString(),
        // то есть System.out.println(h1) = System.out.println(h1.toString())
    }
}
// нужно переопределить метод toString() своим методом toString(), можно изменять тот метод, который нам дам от предков, в данном случае class Object

class Human1 {

    public String toString(){ // public String toString - сигнатура метода toString()
        return name+", "+age;
    }

    private String name; // name - переменная класса Human1 обьекта human1 в main
    private int age; // // age - переменная класса Human1 обьекта human1 в main

    private static int countPeople; // Java автоматически инициализирует переменные класса по умолчанию
    // public static String description; // переменная description делится между всеми обьектами класса Human1


    /* public Human1(){ // public Human1 - конструктор, если конструктора в классе нету, java использует конструктор по умолчанию, конструктор это один из методов
    Конструктор нужен для того, что бы не создавались пустые обьекты(например обьект Human без имени и возраста)
        name = "имя по умолчанию";
        age = 0;
    }

    public Human1(String name){ // имя метода в классе могут быть одинаковыми до тех пор пока их параметры разные
        System.out.println("Привет из второго конструктора!");
        this.name = name;
    } */

    public Human1(String name, int age){ // конструкторы, как и любые методы в java можно перегружать (когда мы можем в одном классе иметь несколько методов с одним именем до тех пор пока у них разные параметры
        // в нашем случае конструктор Human1 принимает на вход имя и возраст
        // System.out.println("Привет из третьего конструктора!");
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printNumberOfPeople(){
        System.out.println("Number of people is: " + countPeople);
    }

    /* public void getAllFields(){
        System.out.println(name + ", " + age + ", " + description);
    } */

    /* public static void printAllFields(){
        System.out.println(description); // Статический метод не может работать с переменными обьекта, потому что переменные у каждого обьекта свои, а статический метод один на класс и общий на все обьекты
     } */
    /* public static void getDescription(){
        System.out.println(description);

    } */
}