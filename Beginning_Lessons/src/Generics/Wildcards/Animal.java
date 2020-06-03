package Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private int id;
    public Animal(){
    }
    public Animal(int id){
        this.id=id;
    }

    public static void eat(){
        System.out.println("Animal is eating...");
    }

    public String toString() {
        return String.valueOf(id);
    }
}
