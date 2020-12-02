import java.util.Arrays;
import java.util.stream.Collectors;

public class DictionaryGenerator {//Для реализации я использовал только Stream

    public static String getWordList(String offer) {
        return Arrays.stream(offer.split(" "))
                .map(x -> x.toLowerCase())
                .distinct()
                .sorted(String::compareTo)
                .map((x) -> x + "\n")
                .collect(Collectors.joining());
    }
}
