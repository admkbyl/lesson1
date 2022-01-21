package String;

import java.util.Scanner;

public class StringClassExercise5 {

    public static void main(String[] args) {


        String s = "amcikAli";//pool object

        System.out.println("Enter a string");
        Scanner scan = new Scanner(System.in);
        String s2 = scan.next();

        System.out.println(s==s2);
        System.out.println(s.equals(s2));
        System.out.println(s == s2.intern());
        System.out.println(s == s2.intern());
    }
}
