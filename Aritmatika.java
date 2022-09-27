import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        int jam , sisaJam, menit, detik, masukan;
        Scanner in = new Scanner(System.in);
        System.out.println("Pengkonversian Waktu");
        System.out.println("--------------------");
        System.out.println("Masukkan Nilai Detik : ");
        masukan = in.nextInt();
        jam = masukan / 3600;
        sisaJam = masukan%3600;
        menit = (sisaJam) /60;
        detik = sisaJam%60;
        System.out.println("Hasil Konversi= " + jam + "jam" + menit + "menit" + detik + "detik");
    }
    
}
