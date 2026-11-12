import java.util.Scanner;

public class Tugas104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = input.nextInt();
        int[] nilai = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
        double rataRata = (double) total / n;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        for (int i = 0; i < n; i++) {
            if (nilai[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " = " + nilai[i] + " (LULUS)");
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + " = " + nilai[i] + " (TIDAK LULUS)");
            }
        }
        input.close();
    }
}