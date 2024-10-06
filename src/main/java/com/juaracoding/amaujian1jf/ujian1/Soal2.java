package com.juaracoding.amaujian1jf.ujian1;
import java.util.Scanner;

/**
 * Program ini untuk mengubah input user nama film menjadi huruf besar.
 */
public class Soal2 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Input user nama film
        System.out.print("Masukkan nama film: ");
        String movieName = scanner.nextLine();

        // Mengubah nama film menjadi uppercase
        upperCaseDisplay(movieName);
    }

    /**
     * Method yang menampilkan nama film dalam uppercase.
     *
     * @param name nama film dalam uppercase
     */
    static void upperCaseDisplay(String name){
        System.out.println("Nama film dalam huruf besar: "+name.toUpperCase());
    }
}