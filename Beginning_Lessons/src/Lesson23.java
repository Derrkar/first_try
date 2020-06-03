public class Lesson23 {
    public static void main(String[] args) {
        String x = "Hello"; // immutable - неизменяемый объект(mutable - изменяемый)
        x = x.toUpperCase(); // Методы класса String не изменяют строку на которую вызываются, а возвращают новую строку
        System.out.println(x);
        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1+string2+string3; // в этом случае создаются 2 дополнительные строки(string1+string2 и string1+string2+string3), что забирает память
        System.out.println(stringAll);
        StringBuilder sb = new StringBuilder("Hello"); // StringBuilder mutable, обьекты класса String, могу изменятся в коде программы
        System.out.println(sb.toString()); // object.toString() - выводит обьект класса String(если StringBuilder)
        sb.append(" my").append(" friend"); // object.append - добавляет строку к обьекту класса String(если StringBuilder), append возвращает обьект на который был вызван
        System.out.println(sb.toString());
        System.out.printf("%f This is %s a string, %d", 10.25, "NICE", 275); // %s - то место куда попадает переменная типа String, %d(digit - цифра) - переменные цифры, %f(floating-point number) - число с запятой
        System.out.println();
        System.out.printf("String, %10d \n", 532); // \n - перенос строки
        System.out.printf("String, %10d \n", 5); // digit between % and d - обозначает ширину окончательного числа
        System.out.printf("String, %10d \n", 100000);
        System.out.printf("String, %10d \n", 1000000000);
        System.out.printf("String, %-10d \n", 532); // if -digit between % and d - тогда числа будут слева, а не справа
        System.out.printf("String, %-10d \n", 5);
        System.out.printf("String, %-10d \n", 100000);
        System.out.printf("String, %-10d \n", 1000000000);
        System.out.printf("String %.3f \n", 45.32265); // .digit between % and f - обозначает количевство знаком после запятой(при этом последнюю цифру округляет)
        System.out.printf("String %.3f \n", 45.32);
        System.out.printf("String %.3f \n", 45.33754);
        System.out.printf("String %.3f \n", 45.322652636);
    }
}
