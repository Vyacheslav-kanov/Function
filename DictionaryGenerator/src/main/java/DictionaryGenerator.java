import java.util.Arrays;
import java.util.stream.Stream;

public class DictionaryGenerator {//Я использовал детерминированные методы и так как это функции они возвращают значения

    public static String getWordList(String offer) {
        StringBuilder builder = new StringBuilder();
        Stream<String> toSet = Arrays.stream(offer.split(" "));
        toSet
                .filter(x -> !(builder.toString().contains(x)))
                .forEach(x -> builder.append(x + "\n"));
        return builder.toString();
    }
}
