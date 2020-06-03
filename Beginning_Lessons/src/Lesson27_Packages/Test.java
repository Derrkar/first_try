package Lesson27_Packages;


import Lesson27_Packages.Forest.Something.SomeClass;
/* import Lesson27_Packages.Forest.Squirell;
import Lesson27_Packages.Forest.Tree; */
import Lesson27_Packages.Forest.*; // * значит, что мы импортируем все классы из пакета Forest

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Squirell squirell1 = new Squirell();
        Scanner scanner1 = new Scanner(System.in);
        SomeClass someInstace = new SomeClass();
    }
}
