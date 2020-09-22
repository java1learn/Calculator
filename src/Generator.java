import java.util.List;

public class Generator {

    public static int romanToArabic(String input) {
        String romanNum = input;
        int result = 0;
        List<RomanNumeral> romanNumerals = RomanNumeral.getListValue();

        int i = 0;
        while ((romanNum.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral numeral = romanNumerals.get(i);
            if (romanNum.startsWith(numeral.name())) {
                result += numeral.getValue();
                romanNum = romanNum.substring(numeral.name().length());
            } else i++;
        }
        return result;
    }

    public String arabicToRoman(int num) {
        List<RomanNumeral> romanNumerals = RomanNumeral.getListValue();
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((num > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= num) {
                sb.append(currentSymbol.name());
                num -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }

}
