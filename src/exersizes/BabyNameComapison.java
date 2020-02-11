package exersizes;

import java.util.Scanner;

public class BabyNameComapison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name1;
        String name2;
        String name3;

        StringBuilder str= new StringBuilder("baby names: ");

        System.out.println("enter name number 1 >>>>");
        name1=input.nextLine();
        System.out.println("enter name number 2 >>>>");
        name2=input.nextLine();
        System.out.println("enter name number 3 >>>>");
        name3=input.nextLine();


      str.append(name1);
      str.append(name2);
      str.append(" ");

      str.append(name1);
      str.append(name3);
      str.append(" ");

      str.append(name2);
      str.append(name1);
      str.append(" ");

      str.append(name2);
      str.append(name3);
      str.append(" ");

      str.append(name3);
      str.append(name1);
      str.append(" ");

      str.append(name3);
      str.append(name2);
      System.out.println(str);



















    }
}
