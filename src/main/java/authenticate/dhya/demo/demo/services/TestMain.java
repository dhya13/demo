package authenticate.dhya.demo.demo.services;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String args[]) {

        /****************   prepare comparator *********************/
        Comparator<Card> compareByColor = Comparator.comparing(Card::getColor);
        // compare by value
        Comparator<Card> compareByValue = Comparator.comparing(Card::getValue);

        //Compare by first name and then last name (multiple fields)
        Comparator<Card> compareByFullCriterias = compareByColor.thenComparing(compareByValue);
        /****************   fin comparator *********************/

        /****************   get all cards  *********************/
        List<Card> cards = initCards();

        /**************** shuffle all cards *********************/
        Collections.shuffle(cards);

        /**************** select 10 cards  **********************/
        List<Card> selectedCards= null;
        if(cards!=null) {
            selectedCards = cards.subList(0, 10);
        }

        /********  Display Results and sort selected cards by Color then by value **********/
        if(selectedCards!=null) {
            System.out.println("Before sorting..");
            selectedCards.forEach(c -> System.out.println(ANSI_RED + c.getLabelValue() + " de " + c.getColor() + ANSI_RED));
            System.out.println(ANSI_GREEN + "------------------------------------------"+ANSI_GREEN);
            List<Card> sortedCards = selectedCards.stream().sorted(compareByFullCriterias).collect(Collectors.toList());
            System.out.println("After Sorting..");
            sortedCards.forEach(c -> System.out.println(c.getLabelValue() + " de " + c.getColor()));
        } else {
            System.out.println("Please afford a list of 10 cards");
        }

    }


    private static List<Card> initCards() {
        List<Card> cards = new ArrayList<>();
        String labelValue = "";
        for (CardColor color : CardColor.values()) {
            for (int i = 1; i < 14; i++) {
                switch (i) {
                    case 1:
                        labelValue = "AS";
                        break;
                    case 11:
                        labelValue = "Valet";
                        break;
                    case 12:
                        labelValue = "Dame";
                        break;
                    case 13:
                        labelValue = "Roi";
                        break;
                    default:
                        labelValue = String.valueOf(i);
                }
                cards.add(new Card(i, color, labelValue));
            }
        }
        return cards;
    }
}


