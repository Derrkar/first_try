package Lesson28_Access_Modifiers.Package1;


public class Person {
    public String name;
    public final static String CONSTANT = "CONSTANT"; // Константы могут быть публичными
    // Нестатическая константа у каждого обьекта своя и на каждую копию выделяется отдельная память, а static у всех одна и память тоже одна
    protected static String name1;

   public Person() {
        name1 = "Bob";
    }
}
