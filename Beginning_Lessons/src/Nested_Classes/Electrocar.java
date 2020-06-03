package Nested_Classes;

import Lesson27_Packages.Forest.Something.SomeClass;

public class Electrocar {
     private int id;

                                ///// Thirst type of nested classes /////
     // вложенные нестатические классы(относятся к объекту), имеют доступ к полям объекта
     // они используются тогда, когда объект класса сложный и когда его можно розделить на несколько подобъектов
     private class Motor {
         public void startMotor(){
            System.out.println("Motor" + id + " is starting...");
        }
    }

                                 ///// Second type of nested classes /////
    // вложенные статические классы(гораздо меньше отношения к классу), не имеют доступа к полям объекта класса
    // они могут быть связаны с классом через статические поля объектов класса
    // они обычно создаются для использования извне
    public static class Battery {
         public void charge() {
             System.out.println("Battery is charging...");
         }
    }

     public Electrocar(int id) {
         this.id = id;
     }

     public void start() {
         // Мы внутри реализации методов этого объекта создаем подобъекты этого объекта и используем их
         Motor motor = new Motor();
         motor.startMotor();
         final int x =1;
                                   ///// Third type of nested classes /////
         // вложенный класс в методе класса имеет доступ и к нестатический полям класса и к переменным метода(но переменные должны быть константами(final))
         class someClass {
             public void someMethod() {
                 System.out.println(x);
                 System.out.println(id);
             }
         }

         SomeClass someObject = new SomeClass();
         test(someObject);

         System.out.println("Electrocar" + id + "  is starting...");
     }

     private void test(Object object) {

     }
}
