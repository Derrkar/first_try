package Primitive_Data_Types.Wrapper_class; // Wrapper class - Класс-обёртка

public class Test {
    public static void main(String[] args) {
        // Double, Float, Long, Integer, Short, Byte, Character and Boolean - Wrapper class(all these classes stands in Packet java.lang(default library)
        // Эти классы содержат полезные методы, которые связаны с примитивами
        Integer x2 = 123; // упаковали примитив в класс-обёртку
        int y = x2; // распоковали примитив с класса-обёртки и теперь он обычный примитив
        int x = Integer.parseInt("1234");
        System.out.println(x);
    }
}
