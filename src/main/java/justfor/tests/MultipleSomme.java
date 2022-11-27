package justfor.tests;

public class MultipleSomme {

    public static void main(String []args){

        int n = 11;
        int sum =computeMultiplesSum(n);
        System.out.println("la somme des multiple est égale à "+sum);
    }

    private static int computeMultiplesSum(int n) {
        int sum = 0;

        for(int i =0; i < n; i++){
            if(i%3==0||i%5==0||i%7==0)
                sum+=i;
        }
        return sum;
    }
}
