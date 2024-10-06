package com.juaracoding.amaujian1jf.ujian1;

/**
 * Program ini menampilkan informasi tiket film.
 */
public class Soal1 {
    public static void main(String[] args) {
        movieTicketInfo("Avengers: Endgame", 50000, (byte) 3);
    }

    /**
     * Method ini menampilkan informasi tiket film.
     *
     * @param name nama film
     * @param price harga tiket film
     * @param qty jumlah tiket film
     */
    static void movieTicketInfo(String name, int price, byte qty){
        System.out.println("Nama Film\t: "+name);
        System.out.println("Harga Tiket\t: "+price);
        System.out.println("Jumlah Tiket: "+qty);
    }
}