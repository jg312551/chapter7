package exersizes;

import java.util.Scanner;

public class countMovieSpace {
    public static void main(String[] args){
        String quote;
        char c;
        int k=0;

        Scanner input= new Scanner(System.in);

        System.out.print(" enter a quote >>>>");
        quote = input.nextLine();

        for(int i =0; i < quote.length(); i++) {
            c = quote.charAt(i);
            if(Character.isWhitespace(c)){
                ++k;
            }
        }
        System.out.println("there are "+k+" spaces");





    }
}
