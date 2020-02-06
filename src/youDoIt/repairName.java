package youDoIt;

import java.util.Scanner;

public class repairName {
    public static void main(String[] args){
        String name;
        String saveOrinalName;
        int stringLength;
        char c;


        Scanner input= new Scanner(System.in);

        System.out.print("please enter your first name >>>>");
        name = input.nextLine();

        saveOrinalName = name;


        for(int i =0; i < name.length(); i++) {
            c=name.charAt(i);
            if(i== 0){
                c= Character.toUpperCase(c);
                name = c + name.substring(1,name.length());
            }


            else{
                if(name.charAt(i)== ' '){
                    ++i;
                    c = name.charAt(i);
                    c = Character.toUpperCase(c);
                    name = name.substring(0,i)+c+name.substring(i+1,name.length());
                }
            }
        }

     System.out.println("original name was "+ saveOrinalName+" \n Repaired name is " +name);
    }

}
