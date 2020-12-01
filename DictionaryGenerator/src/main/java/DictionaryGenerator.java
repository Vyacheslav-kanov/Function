import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DictionaryGenerator {//Я использовал детерминированные методы и так как это функции они возвращают значения

    public static String getWordList(String offer) {
        Stream<String> toSet = Arrays.stream(offer.split(" "));
        Set<String> wordList = toSet
                .collect(Collectors.toSet());

        StringBuilder builder = new StringBuilder();
        wordList.forEach(x -> builder.append(x + "\n"));
        return builder.toString();
    }
}
