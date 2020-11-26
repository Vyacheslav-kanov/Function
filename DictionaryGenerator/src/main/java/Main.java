import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static DictionaryGenerator dictionaryGenerator = new DictionaryGenerator();

    public static void main(String[] args) {
        System.out.println("Введите предложение..");
        String offer = scan.nextLine();
        String result = dictionaryGenerator.getString(DictionaryGenerator.sorter(DictionaryGenerator.getWordList(offer)));
        System.out.println(result);
    }
}
