package Equals;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        //   animal1 - указатель на этот объект       ->      {1} - первый объект класса Animal с полем 1
        //   animal2 - указатель на этот объект       ->      {5} - второй объект класса Animal с полем 5
        //   animal1, animal2 указатели, указатель указывает на какой-то участок памяти, где хранится объект
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(5);
        animal2 = animal1; // теперь указатель animal2 указывает на тот самый объект, на который указывает указатель animal2(на первый объект класса Animal с полем 1)
        System.out.println(animal1==animal2);
        System.out.println(animal1.equals(animal2));
        String string1 = "Hello"; //     string1 ->      {"Hello"}                         // Так работает string pool в java // (java экономит память)
        String string2 = "Hello"; //     string2 ->        {"Hello"} при создании такой же строки, java не выделит отдельно память под новый объект класса String
                                  // вместо этого она указатель string2 ссылает на уже созданый объект , на который ссылается string1(по-этому string1==string2 return true)
        System.out.println(string1==string2);
        String a = "Hello";
        String b = "Hello123".substring(0,5); // substring - отсекает все и осталяет только диапазон мужде первым елементом(включительно) и вторым (не включительно)
        System.out.println(a==b);
    }
}

class Animal {
    private int id;

    Animal(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }



}

