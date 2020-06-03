public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-12);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
        Person person2 = new Person();
        // person1.speak();
        // person1.setNameAndAge("Роман", 20);
        // person1.name = "Роман"; // Через . получаем доступ к полям обьекта классаё
        // person1.age = 50; // параметр 50 поля age обьекта person1 класса Person
        //String s1 = "Вова";
        // person1.sayHello();
        // System.out.println("Меня зовут " + person1.name + ", мне " + person1.age + " лет");
        //person2.setNameAndAge(s1, 30);
        // person2.name = "Вова";
        // person2.age = 20;
        //person1.speak();
        //person2.speak();
        // person2.speak();
        // System.out.println("Меня зовут " + person2.name + ", мне " + person2.age + " лет");
        /* int year1 = person1.calculateYearsToRetirement(); // данные из метода возвращаються в месте вызова метода
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: " + year1 + " лет");
        System.out.println("Первому человеку до пенсии: " + year2 + " лет"); */
    }
}

class Person{ // class - такой тип данных, который ты сам создал
    //У класса могу быть:
    // 1. Данные (поля)
    // 2. Действия, которые он может совершать (методы)
    private String name; // name - имя поля, private - определяет, что поле name доступно и видно в пределах класса Person
    private int age; // age - имя поля

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("Ты ввел пустое имя");
        } else{
            name = userName;
        }
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Возраст должен быть положительным");
        } else age = userAge;
    }
    public int getAge(){
        return age;
    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years; // return - возвращает данные + мгновенно выходит из метода
    }

    void speak(){ // void предназначен для того, что бы создать метод speak - имя метода, в () аргументы или параметры метода
        for(int i = 0; i<3; i++) {
            System.out.println("меня зовут " + name + ", мне " + age + " лет");
        }
    }
    void sayHello(){ // void - пустота, возращает ничто, Он просто выводит на экран
        System.out.println("Привет!");
    }
}
