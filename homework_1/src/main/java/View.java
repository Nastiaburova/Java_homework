public class View {
    public static final String INPUT_STRING_DATA = "Input STRING value = ";
    public static final String WRONG_INPUT_STRING_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_STRING = "STRING value = ";
    public static final String SEPARATOR = "\n";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, String value){
        System.out.println(message + value);
    }
}

