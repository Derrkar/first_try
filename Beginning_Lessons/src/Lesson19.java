public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Tom");
        human1.setAge(18);
        human1.getInfo();
        Human human2 = new Human();
        human2.setName("Bob");
        human2.setAge(25);
        human2.getInfo();
        System.out.println(human1.getName() + ", " + human1.getAge());
    }
}

class Human{
    String name; // поле и атрибут синонимы
    int age;

    public void setName(String name){
        this.name = name; // в Сеттерах используется this., которое позволяет обратится к обьекту этого класа, в данном случае к human1.name
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    } public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name + ", " + age);
    }
}
