import java.util.List;

public class Main {
    private static final String SOURCE_TEXT = "Non est necesse ut omnis qui clamas et inquietas beatos dicenda est " +
            "qui dat gratias parvum vobis gaudium";

    public static void main(String[] args) {
        ToDictionary toDictionary = new ToDictionary();
        List <String> dictionary = toDictionary.add.apply(SOURCE_TEXT);
        dictionary.forEach(System.out::println);
    }
}


