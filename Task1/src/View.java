public class View {
    public static final String INPUT_DATA = "Your input: ";

    public static final String INCORRECT_INPUT_LOWER = "Wrong input. Please, write lower number";
    public static final String INCORRECT_INPUT_HIGHER = "Wrong input. Please, write higher number";

    public static final String CORRECT_INPUT= "Great! You`ve guessed secret number";

    public void printRange (int min, int max) {
        System.out.println("Write integer number from the next range: (" + min + ";" + max + ")");
    }

}
