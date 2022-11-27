package justfor.tests;

public class JoinPoints {

    public static void main(String []args){

        int nb1 = 471;
        int nb2 = 480;

        int jpoint = calculateJoinPoints(nb1,nb2);
        System.out.println();
    }

    private static int calculateJoinPoints(int nb1, int nb2) {
        int jPoint1 = nb1;
        int jPoint2 = nb2;
        int jPoint=0;
        char[] tab1 = String.valueOf(nb1).toCharArray();
        char[] tab2 = String.valueOf(nb2).toCharArray();

        while ((jPoint1>0 && jPoint1 < 20000000 && jPoint2>0 && jPoint2 < 20000000) || (jPoint1!=jPoint2)) {


            for(int i=0; i< tab1.length;i++)
                jPoint1+= Character.getNumericValue(tab1[i]);
            for(int i=0; i< tab2.length;i++)
                jPoint2+= Character.getNumericValue(tab2[i]);
            if(jPoint1 == jPoint2) {
                jPoint = jPoint1;
                break;
            }

            tab1 = String.valueOf(jPoint1).toCharArray();
            tab2 = String.valueOf(jPoint2).toCharArray();

        }

        return jPoint;
    }
}
