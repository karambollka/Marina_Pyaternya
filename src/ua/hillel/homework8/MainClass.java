package ua.hillel.homework8;

public class MainClass {
    public static void main(String[] args) {

        Logg.info(TypeDocument.INVOICE.getType());
        Logg.debug(TypeDocument.ACT.getType());
        Logg.warning(TypeDocument.WAYBILL.getType());
        Logg.error(TypeDocument.ETTN.getType());

    }

}
