package String;

import java.util.Scanner;

public class StringDemo6 {

    public static void main(String[] args) {




        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");

        String str = scan.nextLine();
        System.out.println("Enter the character to find index for: ");
       char ch = scan.next() . charAt(0);


       if(str.indexOf(ch) ==-1)
        System.out.println( "Index of '" +ch+ "'is  not there" );
else{
           System.out.println("Index of '" +ch+ "' is " + str.indexOf(ch));

       }
    }
}
