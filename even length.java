public class Main {
    public static void main(String[] args) {
        String input = "vishnu goutham akhil saketh abhi karthik ";
        
        String[] words = input.split(" ");
        
        System.out.println("Words with even length:");

        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
