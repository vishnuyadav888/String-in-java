public class Main {
    public static void main(String[] args) {
        String original = "hello vishnu!";
        String insert = "545";
        int position = 5; // Inserting after "Hello"
        StringBuilder sb = new StringBuilder(original);
        sb.insert(position, insert);
        System.out.println("Updated String: " + sb.toString());
    }
}
