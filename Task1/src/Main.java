public class Main {
    public static void main(String[] args) {

        View view = new View();
        GuessNumber model = new GuessNumber();

        Controller controller = new Controller(view, model);
        controller.attemptToGuess();

    }
}
