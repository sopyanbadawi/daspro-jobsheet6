import java.util.Scanner;
public class Pemilihan2Tugas04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        String jnsBuku;
        int jmlBuku, hrgBuku = 20000;
        double hrgBayar, diskon, hrgKotor;

        System.out.println("Masukkan Jenis Buku: ");
        jnsBuku = sc04.nextLine();
        System.out.println("Masukkan Jumlah Buku yang Dibeli");
        jmlBuku = sc04.nextInt();

        if (jnsBuku.equalsIgnoreCase("Kamus")) {
            if (jmlBuku > 2) {
            hrgKotor = jmlBuku*hrgBuku;
            diskon = hrgKotor*0.1 + hrgKotor*0.02;
            hrgBayar = hrgKotor - diskon;

            } else {
            hrgKotor = jmlBuku*hrgBuku;
            diskon = hrgKotor*0.02;
            hrgBayar = hrgKotor - diskon;
            }
        } else if (jnsBuku.equalsIgnoreCase("Novel")) {
            if (jmlBuku > 3) {
            hrgKotor = jmlBuku*hrgBuku;
            diskon = hrgKotor*0.07 + hrgKotor*0.02;
            hrgBayar = hrgKotor - diskon;

            } else {
            hrgKotor = jmlBuku*hrgBuku;
            diskon = hrgKotor*0.08;
            hrgBayar = hrgKotor - diskon;
            }
        } else {
            if (jmlBuku > 3) {
            hrgKotor = jmlBuku*hrgBuku;
            diskon = hrgKotor*0.05;
            hrgBayar = hrgKotor - diskon;

            } else {
            hrgKotor = jmlBuku*hrgBuku;
            diskon = 0;
            hrgBayar = hrgKotor - diskon;
            }
        }
            System.out.println("Harga Bayar " + hrgBayar );
            System.out.println("Diskon " + diskon);
    }
}
