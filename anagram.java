import java.util.Arrays;

public class Main {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String string1 = "vigneshu";
        String string2 = "vishnu";
        if (areAnagrams(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }
    }
}