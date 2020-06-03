package Primitive_Data_Types;

public class Test {
    public static void main(String[] args) {
        /* byte           from -128 to 127                                    1 byte or 8 bits
    short             from -32768 to 32767                                2 bytes or 16 bits
    int               from -2147483648 to 2147483647                      4 bytes or 32 bits
    long              from -9223372036854775808 -9223372036854775807      8 bytes or 64 bits
    float             from -3.4E+38 to 3.4E+38                            4 bytes or 32 bits
    double            from -1.7E+308 to 1.7E+308                          8 bytes or 64 bits
    char              from 0 to 65536                                     2 bytes or 16 bits
    boolean           true or false                                       1 bit
    Примитивные типы данных, как коробки, просто хранят в себе данные, в данном случае числа */
        float f = 123.2f; // по умолчанию тип double пока не поставишь f
        long j = 12313151251L;// по умолчанию тип int пока не поставишь L
        int a = 123;
        long l = 85015781051L; // приведение(Преобразование значения переменной одного типа в значение другого типа) типов неявное
        // При неявном приведении преобразование происходит автоматически, по правилам, заложенным в языке Java
        int x = (int)l; // приведение типов явное
        float u = (float)142.2;
        double c = 1241.6;
        long b = Math.round(c);
        System.out.println(b);
        byte m = (byte)128;
        System.out.println(m);
    }
}
