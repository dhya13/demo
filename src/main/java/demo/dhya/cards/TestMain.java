package demo.dhya.cards;


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
        Comparator<Card> compareByValue = Comparator.comparing(Card::getValue);

        //Compare by card color and then card value (multiple fields)
        Comparator<Card> compareByFullCriterias = compareByColor.thenComparing(compareByValue);

        /****************   get all cards  *********************/
        List<Card> cards = initCards();
        List<Card> selectedCards;
        if (cards != null && cards.size() >= 10) {
            /**************** shuffle all cards *********************/
            Collections.shuffle(cards);
            /**************** select 10 cards  **********************/
            selectedCards = cards.subList(0, 10);


            /********  Results **********/
            if (selectedCards != null) {
                System.out.println("Before sorting..");
                selectedCards.forEach(c -> System.out.println(ANSI_RED + (c!=null && c.getLabelValue()!=null ? c.getLabelValue() :"") + " de " + (c!=null && c.getColor()!=null ? c.getColor():"") + ANSI_RED));
                System.out.println(ANSI_GREEN + "------------------------------------------" + ANSI_GREEN);
                /******* sort cards  ******/
                List<Card> sortedCards = selectedCards.stream().sorted(compareByFullCriterias).collect(Collectors.toList());
                System.out.println("After Sorting..");
                sortedCards.forEach(c -> System.out.println((c!=null && c.getLabelValue()!=null ? c.getLabelValue() :"") + " de " + (c!=null && c.getColor()!=null ? c.getColor():"")));
            } else {
                System.out.println("Please choose 10 cards..");
            }
        } else {
            System.out.println("Init cards error !!!");
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


