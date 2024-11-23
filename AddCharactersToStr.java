public class AddCharactersToString {
    public static void main(String[] args) {
        String input = "Hello";
        char charToAdd = '!'; 
        
     
        String result = addCharacter(input, charToAdd);
        
        System.out.println("Updated String: " + result);
    }

    public static String addCharacter(String str, char c) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(c); 
        return sb.toString();
    }
}
