package Nested_Classes;

public class Test {
    public static void main(String[] args) {
        Electrocar eLectrocar = new Electrocar(1);
        eLectrocar.start();

        Electrocar.Battery battery = new Electrocar.Battery();
    }
}
