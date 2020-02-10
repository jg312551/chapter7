package exersizes;

import java.util.Scanner;

public class charicterInfo {
    public static void main(String[] args){

        char aChar;
        Scanner input = new Scanner(System.in);
        System.out.print("place enter a character, number, or space >>>>>>");
        aChar= input.nextLine().charAt(0);

        System.out.println("the character is "+ aChar);


        if(Character.isUpperCase(aChar)){
            System.out.println(aChar +" is uppercase");
        }
        else{
            System.out.println(aChar + " is not uppercase");
        }


        if(Character.isLowerCase(aChar)){
            System.out.println(aChar + " is lowercase");
        }
        else{
            System.out.println(aChar + " is not lowercase");
        }


        aChar = Character.toLowerCase(aChar);
        System.out.println("after toLowercase() aChar is "+aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("after toUppercase() aChar is "+aChar);


        if(Character.isLetterOrDigit(aChar)){

            System.out.println(aChar+ " is a letter or a digit");
        }
        else{
            System.out.println(aChar +" is not a letter or a digit");
        }

        if(Character.isWhitespace(aChar)){
            System.out.println(aChar+" is whitespace");

        }
        else{
            System.out.println(aChar + " is not whitespace");
        }
    }
}
