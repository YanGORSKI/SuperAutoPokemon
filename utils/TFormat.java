package utils;

public class TFormat {
    public TFormat() {
    }


    //reset formating
    public static final String ANSI_reset = "\u001B[0m";

    //font color
    public static final String ANSI_BLACK       = "\u001B[30m";
    public static final String ANSI_RED         = "\u001B[31m";
    public static final String ANSI_GREEN       = "\u001B[32m";
    public static final String ANSI_YELLOW      = "\u001B[33m";
    public static final String ANSI_BLUE        = "\u001B[34m";
    public static final String ANSI_PURPLE      = "\u001B[35m";
    public static final String ANSI_CYAN        = "\u001B[36m";
    public static final String ANSI_WHITE       = "\u001B[37m";

    //background color
    public static final String ANSI_BG_BLACK       = "\u001B[40m";
    public static final String ANSI_BG_RED         = "\u001B[41m";
    public static final String ANSI_BG_GREEN       = "\u001B[42m";
    public static final String ANSI_BG_YELLOW      = "\u001B[43m";
    public static final String ANSI_BG_BLUE        = "\u001B[44m";
    public static final String ANSI_BG_PURPLE      = "\u001B[45m";
    public static final String ANSI_BG_CYAN        = "\u001B[46m";
    public static final String ANSI_BG_WHITE       = "\u001B[47m";

    public static String dDigitsNumber(int number) {
        String stringInt = Integer.toString(number);
        if (stringInt.length()<2) {
            String stringFinal = "0" + stringInt;
            return stringFinal;
        }
        return stringInt;
    }

}
