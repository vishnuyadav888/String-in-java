public class Main {
    public static void main(String[] args) {
        String input = "Java is platform independent programming language ";
        String[] stringArray = input.split(" ");
                for (String str : stringArray) {
            System.out.println(str);
        }
    }
}