import java.util.ArrayList;
import java.util.List;

public class DictionaryGenerator {//Я использовал детерминированные методы и так как это функции они возвращают значения

    private String offer;

    public DictionaryGenerator() {
    }

    public static List<String> getWordList(String offer) {
        List<String> wordList = new ArrayList<>();

        String[] split = offer.split(" ");

        for (int i = 0; i < split.length; i++) {
            wordList.add(split[i] + "\n");
        }

        return wordList;
    }

    public static List<String> sorter(List<String> notSorted) {
        List<String> sortedDictionary = notSorted;
        sortedDictionary.sort(String::compareTo);
        return sortedDictionary;
    }

    public String getString(List<String> list) {
        StringBuilder builder = new StringBuilder();
        list.forEach(x -> builder.append(x));
        return builder.toString();
    }
}
