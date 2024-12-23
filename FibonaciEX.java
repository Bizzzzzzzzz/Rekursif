public class FibonaciEX {
    public static void sumOfThree(int maks, int x, int y, int z) {
        if (maks == 0) {
            return;
        } else {
            System.out.println(x + " ");
            sumOfThree(maks-1, y, z, x+y+z);
        }
    }

    public static void main(String[] args) {
        sumOfThree(5, 1, 1, 1);
    }
}
