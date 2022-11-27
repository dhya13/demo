package justfor.tests;

public class Concatenate {


    public static void main(String[] args) {
        String tab[] = {"f", "o", "o", "bar"};
        String result = concatene(tab);
        System.out.println(result);
    }

    private static String concatene(String[] tab) {

        if (tab == null || tab.length == 0)
            return "";
        StringBuilder sb = new StringBuilder("");
        for (String v : tab) {
            sb.append(v);
        }

        return sb.toString();
    }
}
