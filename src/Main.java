import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        Generator generator = new Generator();
        Calculator calculator = new Calculator();

        Scanner input = new Scanner(System.in);
        System.out.print("Введите пример: ");
        String inputString = input.nextLine();


        converter.converter(inputString);


        if (Checker.isBetween(converter.getArabicA()) &&
                Checker.isBetween(converter.getArabicB())) {
            System.out.println(calculator.calculate(
                    converter.getArabicA(),
                    converter.getArabicB(),
                    converter.getOperation()));
        } else
            System.out.println(generator.arabicToRoman(calculator.calculate(
                    Generator.romanToArabic(converter.getRomanA()),
                    Generator.romanToArabic(converter.getRomanB()),
                    converter.getOperation()
            )));
    }

}
