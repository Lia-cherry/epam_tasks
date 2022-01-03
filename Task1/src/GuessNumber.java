import java.util.LinkedList;

public class GuessNumber {
    private static int LOWER = 1;
    private static int HIGHER = 100;

    private final static int SECRET_NUMBER = (int) (Math.random() * (HIGHER - LOWER)) + LOWER;

    LinkedList<String> inputRecord = new LinkedList<>();

    public int add(String record) {
        if (isInteger(record)) return Integer.parseInt(record);
        else return -1;
    }

    public int getLastElement() {
        if (checkInteger(inputRecord.get(inputRecord.size() - 1)))
            return Integer.parseInt(inputRecord.get(inputRecord.size() - 1));
        else return -1;
    }

    public boolean checkInteger (String record) {
        try {
            Integer.parseInt(record);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    public boolean isInteger(String record) {
        inputRecord.add(record);
        return checkInteger(record);

    }

    public static void setHIGHER(int HIGHER) {
        GuessNumber.HIGHER = HIGHER;
    }

    public static void setLOWER(int LOWER) {
        GuessNumber.LOWER = LOWER;
    }

    public int getMin() {
        return LOWER;
    }

    public int getMax() {
        return HIGHER;
    }

    public static int getSecretNumber() {
        return SECRET_NUMBER;
    }

    public void showList() {
        System.out.println("List of previous attempts");
        for (int i = 0; i < inputRecord.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + inputRecord.get(i));
        }
    }
}

