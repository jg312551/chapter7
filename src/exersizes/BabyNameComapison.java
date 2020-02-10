package exersizes;

import java.util.Scanner;

public class BabyNameComapison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name1;
        String name2;
        String name3;
        String combanation;


        System.out.println("enter name number 1 >>>>");
        name1=input.nextLine();
        System.out.println("enter name number 2 >>>>");
        name2=input.nextLine();
        System.out.println("enter name number 3 >>>>");
        name3=input.nextLine();


        System.out.println(name1+name1);
        System.out.println(name1+name2);
        System.out.println(name1+name3);

        System.out.println(name2+name1);
        System.out.println(name2+name2);
        System.out.println(name2+name3);

        System.out.println(name3+name1);
        System.out.println(name3+name2);
        System.out.println(name3+name3);











    }
}
