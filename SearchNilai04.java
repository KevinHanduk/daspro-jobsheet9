public class SearchNilai04 {
    public static void main(String[] args) {
        int[] nilai = {78, 65, 90, 55, 88, 72};
        int key = 90;
        boolean temukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                temukan = true;
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                break;
            }
        }
        if (!temukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}
