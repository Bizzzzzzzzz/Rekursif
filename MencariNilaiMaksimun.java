public class MencariNilaiMaksimun {
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int maxOfRest = findMax(arr, n-1);
        return Math.max(maxOfRest, arr[n-1]);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 15};
        int n = arr.length;
        int max = findMax(arr, n);
        System.out.println("Nilai terbesar dalam Array adalah " + max);
    }
}
