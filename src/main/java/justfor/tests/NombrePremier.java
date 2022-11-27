package justfor.tests;

import java.util.ArrayList;
import java.util.List;

public class NombrePremier {

    public static void main(String []args){
        int nb=-13 ;
        boolean isPremier = estPremier(nb);
        System.out.println(nb+" est premier "+isPremier);
        int tab[]= {3,6,-5,-1,1,8,-3,9};
        int ctz = closestToZero(tab);
        System.out.println(Math.abs(tab[ctz]));
        long monnaie=9223372036854775802L;
        Monnaie m =monnaie(monnaie);
        System.out.println(m.getDix()+ " dix + "+m.getCinq()+" cinq "+ m.getDeux()+" deux !!!");
    }

    private static Monnaie monnaie(long monnaie) {
        Monnaie m = new Monnaie();
        for(int i= 0; i <= monnaie; i++){
            next:
            for(int j = 0; j<= (monnaie-(10*i)); j++ ){
                for(int k=0; k <= monnaie-(10*i+5*j); k++){
                    if(monnaie == (k*2+5*j+10*i)){
                        if(i> m.getDix() || i == m.getDix() && j> m.getCinq() || i == m.getDix() && j== m.getCinq() && k > m.getDeux()){
                            m = new Monnaie(i,j,k);
                        }

                    } else if(monnaie < (k*2+5*j+10*i)){
                        break next;
                    }
                }
            }
        }

        return m;
    }

    private static int closestToZero(int[] tab) {
        int f =2147483647;
        int index=0;
        for(int i =0;i < tab.length;i++){
            int n = tab[i];
            if(Math.abs(n) < f) {
                f = Math.abs(n);
                index = i;
            }
        }


        return index;
    }

    private static boolean estPremier(int n) {

        int nb = Math.abs(n);
        if(nb ==0)
            return false;
        for(int i =2; i<nb-1; i++){
            if(nb%i==0)
                return false;
        }

        return true;
    }
}

 class Monnaie{

     private int dix;
     private int cinq;
     private int deux;


    public  Monnaie(){

     }
     public Monnaie(int dix, int cinq, int deux) {
         this.dix = dix;
         this.cinq = cinq;
         this.deux = deux;
     }

     public int getDix() {
         return dix;
     }

     public void setDix(int dix) {
         this.dix = dix;
     }

     public int getCinq() {
         return cinq;
     }

     public void setCinq(int cinq) {
         this.cinq = cinq;
     }

     public int getDeux() {
         return deux;
     }

     public void setDeux(int deux) {
         this.deux = deux;
     }
 }
