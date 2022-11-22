package ua.hillel.homework8;

public enum TypeDocument {

    INVOICE("invoice"),
    ETTN("ettn"),
    ACT("act"),
    WAYBILL("waybill");

    private String type;

    TypeDocument(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
