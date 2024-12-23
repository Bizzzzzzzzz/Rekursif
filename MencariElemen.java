public class MencariElemen {
    public static boolean isContain(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int panjang = array.length;
        int dicari = 30;
        if (isContain(array, panjang, dicari)) {
            System.out.println("Data " + dicari + " Ditemukan dalam Array");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
