package ua.hillel.homework6_Poker;


public class Card {

    private String suite;
    private String value;

    public Card(String[] suite, String[] value) {

    }

    public  Card(String suite, String value){
        this.suite=suite;
        this.value=value;
    }

    public String getSuites() {
        return suite;
    }

    public void setSuites(String suite) {
        this.suite = suite;
    }

    public String getValues() {
        return value;
    }

    public void setValues(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card " +
                "suite='" + suite + '\'' +
                ", value ='" + value + '\'' ;
    }

}
