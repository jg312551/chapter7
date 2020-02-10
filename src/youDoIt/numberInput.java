package youDoIt;

import java.util.Scanner;

public class numberInput {
    public static void main(String[] args){

        int inputNum;
        int result;

        final int FACTOR = 10;

        Scanner input = new Scanner(System.in);

        System.out.print(" enter a number >>>");
        inputNum = input.nextInt();

        result = inputNum * FACTOR;

        System.out.println(inputNum + " * "+ FACTOR +" = "+ result);






    }
}
