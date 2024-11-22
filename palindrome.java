public class Main {
    public static void main(String[] args) {
        String input = "545"; 
        boolean isPalindrome = true;
        
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}
