public class Main{
    public static void main(String[] args) {
        String inputString = " Java is platform independent programming language ";
        int wordCount = countWords(inputString);
        System.out.println("The number of words in the string is: " + wordCount);
    }
    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
