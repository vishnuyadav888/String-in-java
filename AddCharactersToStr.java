public class AddCharactersToString {
    public static void main(String[] args) {
        String input = "Hello";
        char charToAdd = '!'; // Character to be added
        
        // Add the character to the string using StringBuilder
        String result = addCharacter(input, charToAdd);
        
        System.out.println("Updated String: " + result);
    }

    public static String addCharacter(String str, char c) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(c); // Add character to the end of the string
        return sb.toString();
    }
}