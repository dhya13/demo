package justfor.tests;

import java.util.Arrays;

public class VerifyTwins {

    public static void main(String  []args){

        String t1 = "Romain";
        String t2 = "Marion";
        boolean isTwins = isTwins(t1,t2);
        System.out.println(isTwins);
    }

    private static boolean isTwins(String t1, String t2) {

        if(t1==null || t2==null)
            return false;
        t1 = t1.toUpperCase();
        t2 = t2.toUpperCase();

        char[] tab1 = t1.toCharArray();
        char[] tab2 = t2.toCharArray();

        Arrays.sort(tab1);
        Arrays.sort(tab2);

        return (new String(tab1)).equals(new String(tab2));


    }
}
