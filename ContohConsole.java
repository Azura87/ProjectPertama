import java.io.Console;

public class ContohConsole {
    public static void main(String[] args) {
        String nama;
        int usia;
        Console masukan = System.console();
        System.out.println("Masukkan nama = ");
        nama = masukan.readLine();
        System.out.println("Masukkan Usia = ");
        usia = Integer.parseInt(masukan.readLine());
        System.out.println("Namamu adalah = "+nama);
        System.out.println("Usiamu adalah = "+usia);
    }
}
