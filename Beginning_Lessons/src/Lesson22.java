public class Lesson22 {
    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);
        // new Test(); Что бы инициализировать переменную через конструктор, нужно создать обькт и передать значение переменной в параметр
        // Test.CONSTANT = 10; если переменная статическая, то мы инициализируем ее вот таким образом
    }
}

class Test{
    public static final int CONSTANT = 0;// Константы пишутся заглавными буквами

    /* public Test(int CONSTANT){ // статик переменные инициализируют не через обьект, а через имя класса
        this.CONSTANT = CONSTANT;
    } */

}
