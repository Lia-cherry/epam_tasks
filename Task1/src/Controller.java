import java.util.Scanner;

public class Controller {
    private View view;
    private GuessNumber model;

    public Controller(View view, GuessNumber model) {
        this.view = view;
        this.model = model;
    }

    public void attemptToGuess(){
        Scanner sc = new Scanner(System.in);
        do {


            if (model.isInteger(sc.nextLine())) {
                model.showList();

                if (model.getLastElement() < model.getMin() || model.getLastElement() > model.getMax()) {
                    view.printRange(model.getMin(), model.getMax());
                } else if (model.getLastElement() > GuessNumber.getSecretNumber()) {
                    GuessNumber.setHIGHER(model.getLastElement());
                    System.out.println(View.INCORRECT_INPUT_LOWER);
                    view.printRange(model.getMin(), model.getMax());
                } else if (model.getLastElement() < GuessNumber.getSecretNumber()) {
                    GuessNumber.setLOWER(model.getLastElement());
                    System.out.println(View.INCORRECT_INPUT_HIGHER);
                    view.printRange(model.getMin(), model.getMax());
                } else {
                    System.out.println(View.CORRECT_INPUT);
                }
            } else {
                view.printRange(model.getMin(), model.getMax());
            }
        } while (model.getLastElement() != GuessNumber.getSecretNumber());
    }


}
