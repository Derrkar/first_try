package Serialization_Deserialization;

import java.io.Serializable;

public class Person implements Serializable {
     // Имплеменция интерфейса Serializable разрешает сериализовывать/десериализовывать объекты класса
    private int id;
    private String name; // transient - когда мы не хотим это поле сериализовывать
                           // File -> Setting -> Editor -> Inspections //
    private static final long serialVersionUID = 4774599908369044414L;
    // в serialVersionUID хранится инфа об классах и полях и тд., по-этому его нужно указывать на тот случай, если со всеремен java обновится и что-то в классах, полях и тд. изменится

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
