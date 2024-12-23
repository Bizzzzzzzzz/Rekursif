public class Palindrome {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start+1, end-1);
    }

    public static void main(String[] args) {
        String object = "katak";
        int kanan = object.length();
        kanan-=1;
        
        if (isPalindrome(object, 0, kanan)) {
            System.out.println("Input adalah Palindrome");
        } else {
            System.out.println("Input bukan Palindrome");
        }
    }
}
