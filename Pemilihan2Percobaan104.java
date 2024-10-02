import java.util.Scanner;
public class Pemilihan2Percobaan104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tahun04;
        
        System.out.print("Masukkan Tahun: ");
        tahun04 = sc.nextInt();

        if ((tahun04 % 4) == 0) {
            if ((tahun04 % 100) != 0) {
                System.out.println("Tahun Kabisat");
            }
        } else
            System.out.println("Bukan Tahun Kabisat");
    }
}