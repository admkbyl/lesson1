package String;

public class StringDemo2 {

    public static void main(String[] args) {

        String s1 = "Rihanna"  ;
        String s2 = new String("Rihanna" ) ; // heap object

// its false because they are two different objects in memory
        // references s1 and s2 are referring to two different
        // objects in the memory, hence below results to false
        System.out.println(s1==s2);


    }
}
