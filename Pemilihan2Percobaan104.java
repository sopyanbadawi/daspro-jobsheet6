import java.util.Scanner;
public class Pemilihan2Percobaan104 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        int tahun;
        
        System.out.print("Masukkan Tahun: ");
        tahun = sc04.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            }
        } else
            System.out.println("Bukan Tahun Kabisat");
    }
}