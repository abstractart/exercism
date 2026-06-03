import java.util.HashMap;
import java.util.Map;

class SqueakyClean {
    static Map<Character, Character> mapping = Map.of('4', 'a', '3', 'e', '0', 'o', '1', 'l','7', 't', ' ', '_');
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);

            if (mapping.containsKey(c)) {
                c = mapping.get(c);
            }
            else if (!Character.isLetter(c)  || c == '-') {
                continue;
            }

            if (i > 0 && identifier.charAt(i - 1) == '-') {
                c = Character.toUpperCase(c);
            }
            builder.append(c);
        }

        return builder.toString();
    }
}
