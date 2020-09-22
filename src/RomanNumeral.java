import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

enum RomanNumeral {

    C(100),XC(90),L(50),XL(40),X(10),IX(9),V(5),IV(4),I(1);

    private final int value;

    RomanNumeral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<RomanNumeral> getListValue(){
        return Arrays.asList(values());
    }

}
