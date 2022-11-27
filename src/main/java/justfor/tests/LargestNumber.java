package justfor.tests;

public class LargestNumber {

    public static void main(String[] args) {
        int tab[] = {-1, -4, -6, -4, -78, -19};
        int largest = getLargestNumber(tab);
        System.out.println("largest number is: "+largest);

    }

    private static int getLargestNumber(int[] tab) {
        int lnb = -999999999;

        for(int i = 0; i< tab.length; i++){
            if(tab[i]>lnb)
                lnb = tab[i];
        }
        return lnb;
    }
}
