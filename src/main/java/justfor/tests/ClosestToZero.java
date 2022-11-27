package justfor.tests;

public class ClosestToZero {

    public static void main(String[] args) {

        int[] tab = {-1, -5, 9, 2, 1, -5, 10};
        int closestNumber = getClosestToZero(tab);
        System.out.println("Closest To Zero == "+tab[closestNumber]);
    }

    private static int getClosestToZero(int[] tab) {
        int result = 999999999 ;
        int index = 0;

        if(tab==null || tab.length==0)
            return 0;

        for(int i=0; i< tab.length ; i++){
            if(Math.abs(tab[i]) < result || (Math.abs(tab[i]) == result && tab[index] <0)){
                result = Math.abs(tab[i]);
                index = i;
            }
        }

        return index;
        }

}
