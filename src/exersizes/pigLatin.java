package exersizes;

import java.util.Scanner;

public class pigLatin {
    public static void main(String[] args){
        String user;
        StringBuilder str= new StringBuilder();
        Scanner input = new Scanner(System.in);
        char hold;
        char [] vowels ={'a','e','i','o','u'};
        int counter=0;



        System.out.print("enter a word >>>>");
        user = input.nextLine();


        for(int i = 0; i<user.length();++i){
            hold = user.charAt(i);

            for(int j=0;j< vowels.length; ++j){
                if(hold == vowels[j]){
                    str.append(Character.toString(hold));
                }
               else{
                    ++counter;
                    System.out.println(counter);
                }
            }
            if(counter == 5){
                str.append(Character.toString(hold));
            }
            counter =0;

        }
        System.out.println(str);

    }
}
