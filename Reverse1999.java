public class Reverse1999 {

    public static void printReverse(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n + " ");
            printReverse(n-1);
        }
    }
    
    public static void main(String[] args) {
        int a = 5;
        printReverse(a);
    }
}
    