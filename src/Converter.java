public class Converter {
    private String romanA;
    private String romanB;
    private int arabicA;
    private int arabicB;
    private char operation;

    public String getRomanA() {
        return romanA;
    }

    public void setRomanA(String romanA) {
        this.romanA = romanA;
    }

    public String getRomanB() {
        return romanB;
    }

    public void setRomanB(String romanB) {
        this.romanB = romanB;
    }

    public int getArabicA() {
        return arabicA;
    }

    public void setArabicA(int arabicA) {
        this.arabicA = arabicA;
    }

    public int getArabicB() {
        return arabicB;
    }

    public void setArabicB(int arabicB) {
        this.arabicB = arabicB;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void converter(String input) {
        String[] numbers = input.split("\\s");
        setOperation(numbers[1].charAt(0));
        if (Checker.isNumeric(numbers[0]) &&
            Checker.isNumeric(numbers[2])) {
            if (Checker.isBetween(Integer.parseInt(numbers[0])) ||
                Checker.isBetween(Integer.parseInt(numbers[2]))) {
                    setArabicA(Integer.parseInt(numbers[0]));
                    setArabicB(Integer.parseInt(numbers[2]));
            }
        } else {
            setRomanA(numbers[0]);
            setRomanB(numbers[2]);
        }
    }


}
