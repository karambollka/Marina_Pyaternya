package ua.hillel.homework8;

import java.util.logging.Logger;

import static ua.hillel.homework8.Color.*;

public class Logg {
    private static final Logger LOGGER = Logger.getLogger(Logg.class.getName());

    /*public void createLog(TypeDocument type) {

        LOGGER.log(Level.INFO,ANSI_GREEN , "create document with type " + type.getType() , ANSI_RESET);
        LOGGER.log(Level.WARNING, ANSI_RED + "Error creating document " + type.getType() + ANSI_RESET);
        LOGGER.log(Level.CONFIG, ANSI_PURPLE + "create document with config " + type.getType() + ANSI_RESET);
        LOGGER.log(Level.SEVERE,ANSI_PURPLE + "create document with severe " + type.getType() + ANSI_RESET);
    }*/

    public static void info(String type) {
        System.out.println(ANSI_GREEN + " Create document with type " + type + ANSI_RESET);
    }

    //error
    public static void error(String type) {
        System.out.println(ANSI_RED + " The message was created with an error with the type " + type + ANSI_RESET);
    }

    //debug
    public static void debug(String type) {
        System.out.println(ANSI_BLUE + " Debug document with type " + type + ANSI_RESET);
    }

    //warning
    public static void warning(String type) {
        System.out.println(ANSI_YELLOW + "Warning when creating document with type " + type + ANSI_RESET);
    }

}
