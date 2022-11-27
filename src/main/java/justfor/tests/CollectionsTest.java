package justfor.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {

    public static void main(String []args){

        List<Fruit> liste = new ArrayList<>();
        liste.add(new Fruit("orange",13));
        liste.add(new Fruit("fraise",45));
        liste.add(new Fruit("poire",74));
        liste.add(new Fruit("banane",11));

        Comparator<Fruit> compareByFruitName = Comparator.comparing(Fruit::getFruitName).reversed();
        Collections.sort(liste,compareByFruitName);
        afficherList(liste,"After sorting..");


        /*  shuffle liste */
        Collections.shuffle(liste);
        afficherList(liste,"After Shuffle");
        int res = Collections.binarySearch(liste, new Fruit("banane", 11), compareByFruitName);// return the position
        System.out.println(res);

        Integer i = 10;
        Fruit f = new Fruit("poire",22);
        String test ="Dhya";
        testParametre(f,i, test);
        System.out.println(f.getQuantity());
        System.out.println(i);
        System.out.println(test);
    }

    private static void testParametre(Fruit f, Integer i, String test) {
        f.setQuantity(33);
        i = 13;
        test+= "Adam";
        System.out.println(i);
        System.out.println(test);
    }

    private static void afficherList(List<Fruit> liste, String message) {
        System.out.println(message);
        liste.forEach(f->System.out.println(f.getFruitName()));
    }
}

class Fruit{

    private String fruitName;
    private Integer quantity;


    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Fruit(String fruitName, Integer quantity) {
        this.fruitName = fruitName;
        this.quantity = quantity;
    }
}
