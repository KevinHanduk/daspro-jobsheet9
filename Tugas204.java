import java.util.Scanner;

public class Tugas204 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar menu dan harga
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", 
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        int[] harga = {
            15000, 13000, 10000, 12000, 8000, 18000, 20000
        };

        System.out.print("Cari nama menu: ");
        String cari = input.nextLine();
        int indeksCari = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                indeksCari = i;
                break;
            }
        }
        if (indeksCari != -1) {
            System.out.println(menu[indeksCari] + " tersedia dengan harga Rp" + harga[indeksCari]);
        } else {
            System.out.println("Menu tidak tersedia");
        }

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int n = input.nextInt();
        input.nextLine();

        String[] pesanan = new String[n];
        int[] hargaPesanan = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Pilih nama menu ke-" + (i + 1) + ": ");
            String namaPesanan = input.nextLine();
            boolean ditemukan = false;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(namaPesanan)) {
                    pesanan[i] = menu[j];
                    hargaPesanan[i] = harga[j];
                    total += harga[j];
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Menu tidak valid.");
                pesanan[i] = "Tidak Valid";
                hargaPesanan[i] = 0;
            }
        }
        System.out.println("PESANAN ANDA");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("Total Biaya: Rp" + total);

        input.close();
    }
}
