import java.util.Scanner;

public class CamelCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String[] parts = input.split(";");
            String operation = parts[0];
            String type = parts[1];
            String words = parts[2];
            
            if (operation.equals("S")) {
                splitCamelCase(words, type);
            } else if (operation.equals("C")) {
                combineCamelCase(words, type);
            }
        }
        
        scanner.close();
    }

    private static void splitCamelCase(String words, String type) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length(); i++) {
            char c = words.charAt(i);
            
            if (Character.isUpperCase(c)) {
                result.append(" ").append(Character.toLowerCase(c));
            } else if (c == '(' || c == ')') {
                continue;
            } else {
                result.append(c);
            }
        }
        
        System.out.println(result.toString().trim());
    }

    private static void combineCamelCase(String words, String type) {
        String[] splitWords = words.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < splitWords.length; i++) {
            String word = splitWords[i];
            if (i == 0) {
                result.append(word.toLowerCase());
            } else {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase());
            }
        }
        
        if (type.equals("M")) {
            result.append("()");
        } else if (type.equals("C")) {
            result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
        }
        
        System.out.println(result.toString());
    }
}
