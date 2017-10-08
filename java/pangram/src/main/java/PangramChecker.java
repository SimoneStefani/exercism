import java.util.*;

public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase().replaceAll("[^a-z]", "");
        char[] sentence = input.toCharArray();

        Set<Character> alphabet = new HashSet<Character>();
        for (char c : sentence) alphabet.add(c);

        return alphabet.size() == 26;
    }

}
