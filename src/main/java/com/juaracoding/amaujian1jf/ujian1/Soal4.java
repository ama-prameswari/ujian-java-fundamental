package com.juaracoding.amaujian1jf.ujian1;
import java.util.Scanner;

/**
 * Program untuk menginput dan menampilkan nama film.
 */
public class Soal4 {
    public static void main(String[] args) {
        String[] filmNames = new String[5];

        System.out.println("Daftar film bioskop");
        displayMovies(inputNames(filmNames)); // Menginput dan menampilkan nama film
    }

    /**
     * Metode untuk menginput nama film.
     *
     * @param names array string untuk menyimpan nama film
     * @return array string yang berisi nama film
     */
    static String[] inputNames(String[] names){
        Scanner scanner = new Scanner(System.in); // New Scanner

        // Input nama film
        for (int i = 0; i < names.length; i++) {
            System.out.print("Masukkan nama film " + (i+1) + ": "); // i+1 -> (0+1=1), film dimulai dari 1 bukan 0
            names[i] = scanner.nextLine();
        }
        return names;
    }

    /**
     * Metode untuk menampilkan nama film.
     *
     * @param movies array string yang berisi nama film
     */
    static void displayMovies(String[] movies){
        System.out.println("Film yang ingin ditonton:");
        for (int i = 0; i < movies.length; i++) {
            System.out.println((i+1) + ". " + movies[i]);
        }
    }
}
