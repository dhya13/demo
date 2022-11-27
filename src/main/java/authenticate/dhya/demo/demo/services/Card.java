package authenticate.dhya.demo.demo.services;

public class Card {
    private Integer value; // 1 --> 13
    private CardColor color; //
    private String labelValue;


    public Card(Integer value, CardColor color, String labelValue) {
        this.value = value;
        this.color = color;
        this.labelValue = labelValue;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public CardColor getColor() {
        return color;
    }

    public void setColor(CardColor color) {
        this.color = color;
    }

    public String getLabelValue() {
        return labelValue;
    }

    public void setLabelValue(String labelValue) {
        this.labelValue = labelValue;
    }

}
