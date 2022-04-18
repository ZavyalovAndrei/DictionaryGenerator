import java.util.List;

public class Main {
    private static final String SOURCE_TEXT = "Non est necesse ut omnis qui clamas et inquietas beatos dicenda est " +
            "qui dat gratias parvum vobis gaudium";

    public static void main(String[] args) {
        AddToDictionary addToDictionary = new AddToDictionary();
        List <String> dictionary = (List<String>) addToDictionary.apply(SOURCE_TEXT);
        dictionary.forEach(System.out::println);
    }
}


