/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpertama;

import java.util.Scanner;

/**
 *
 * @author T470s
 */
public class KonversiNilai {
    public static void main(String[] args) {
        String nim, nama, prodi, matkul;
        String grade = "";
        int nilai;
        Scanner masukan = new Scanner(System.in);
        System.out.println("=====Masukan Data=====");
        System.out.println("Masukkan NIM = ");
        nim = masukan.nextLine();
        System.out.println("Masukkan Nama = ");
        nama = masukan.nextLine();
//        System.out.println("Masukkan Prodi = ");
//        prodi = masukan.nextLine();
        prodi = nim.substring(3,5);
        switch (prodi) {
            case "52" :
            System.out.println("Program Studi = S-1 Teknologi Informasi");
            break;
            case "51" :
            System.out.println("Program Studi = S-1 Sistem Informasi");
            break;
            case "31" :
            System.out.println("Program Studi = D-3 Sistem Informasi");
            break;
            default :
            System.out.println("Prodi tidak ditemukan");
        }
        System.out.println("Matakuliah = ");
        matkul = masukan.nextLine();
        System.out.println("Masukkan Nilai Angka = ");
        nilai = masukan.nextInt();
         if (nilai >= 85) {
            grade = "A";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 80) {
            grade = "A-";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 75) {
            grade = "B+";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 70) {
            grade = "B";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 65) {
            grade = "B-";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 60) {
            grade = "C+";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 55) {
            grade = "C";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 50) {
            grade = "C-";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 45) {
            grade = "D";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai <= 40) {
            grade = "E";
            System.out.println("Grade nilai siswa : " + grade);
        } else {
            System.out.println("Inputan anda tidak sesuai !");
        }
          switch (grade) {
            case "A":
                System.out.println("Sangat Memuaskan");
                break;
            case "A-":
                System.out.println("Sangat Memuaskan");
                break;
            case "B+":
                System.out.println("Memuaskan");
                break;    
            case "B":
                System.out.println("Memuaskan");
                break;    
            case "B-":
                System.out.println("Memuaskan");
                break;    
            case "C+":
                System.out.println("Cukup");
                break;    
            case "C":
                System.out.println("Cukup");
                break;    
            case "C-":
                System.out.println("Cukup");
                break;    
            case "D":
                System.out.println("Kurang");
                break;    
            case "E":
                System.out.println("Sangat Kurang");
                break;    
            default:
                break;
        }
        System.out.println("=====Hasil Pengolahan Data=====");
//        Mengambil Jurusan dari NIM
//        if (prodi.equals("52")) {
//            System.out.println("Program Studi = S-1 Teknologi Informasi");
//        } else if (prodi.equals("51")) {
//            System.out.println("Program Studi = S-1 Sistem Informasi");
//        } else if (prodi.equals("31")) {
//            System.out.println("Program Studi = D-3 Sistem Informasi");
//        } else {
//            System.out.println("Program Studi tidak ditemukan");
//        }
    }
}
