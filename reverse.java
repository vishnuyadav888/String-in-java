public class Main{
    public static void main(String[] args) {
        String input = "vishnu 545!"; 
        String reversed = reverse(input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverse(String str) {
        StringBuilder reversedString = new StringBuilder(str);
        return reversedString.reverse().toString();
    }
}