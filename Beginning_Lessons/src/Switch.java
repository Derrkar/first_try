import java.util.Scanner;

public class Switch { // Switch - похож на if, используется когда есть много условий, которые нужно перебрать
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        String age = scanner.nextLine();
       /* if(age==10){
            System.out.println("Ты учишься в школе");
        } else if(age==18){
            System.out.println("Ты закончил школу");
        } else if(age==21){
            System.out.println("Ты учишься в универе");
        } */
        switch(age){
            case "ноль" :
                System.out.println("Ты родился");
                break;
            case "семь" :
                System.out.println("Ты пошел в школу");
                break;
            case "восемнадцять" :
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }
    }
}
