package com.juaracoding.amaujian1jf.ujian1;

/**
 * Program untuk menghitung harga tiket berdasarkan jumlah tiket dan jenis hari.
 */
public class Soal3 {
    public static void main(String[] args) {
        int ticketQty = 6;
        String dayType = "weekday";

        // Hitung harga tiket
        double totalPrice = ticketPrice(ticketQty, dayType);

        // Tampilkan hasil
        calculateTicketPrice(ticketQty, totalPrice, true);
    }

    /**
     * Method untuk menghitung harga tiket berdasarkan jumlah tiket dan jenis hari.
     *
     * @param ticketQty jumlah tiket yang akan dibeli
     * @param dayType   jenis hari (weekday atau weekend)
     * @return harga tiket
     */
    public static double ticketPrice(int ticketQty, String dayType) {
        double pricePerTicket;
        if (dayType.equals("weekday")) {
            pricePerTicket = 35000;
        } else if (dayType.equals("weekend")) {
            pricePerTicket = 45000;
        } else {
            System.out.println("Invalid day type. Please enter weekday or weekend.");
            return 0; // Exit jika day type tidak valid
        }

        // Hitung harga tiket total
        double totalPrice = ticketQty * pricePerTicket;

        // Diskon 10% jika jumlah tiket lebih dari 5
        double discount = 0;

        if (ticketQty > 5) {
            discount = totalPrice * 0.1;
        }

        // Kurangi harga tiket total dengan diskon
        totalPrice -= discount;

        return totalPrice;
    }

    /**
     * Method untuk menampilkan hasil perhitungan harga tiket.
     *
     * @param ticketQty jumlah tiket yang akan dibeli
     * @param totalPrice harga tiket total
     * @param isDiscount akan menampilkan dengan diskon atau tanpa diskon
     */
    public static void calculateTicketPrice(int ticketQty, double totalPrice, boolean isDiscount) {
        // Tampilkan jumlah tiket
        System.out.println("Jumlah tiket: " + ticketQty);

        if (isDiscount) {
            // Tampilkan harga tiket total dengan diskon
            System.out.println("Total harga (dengan diskon): " + (int) totalPrice);
        } else {
            // Tampilkan harga tiket total tanpa diskon
            double originalPrice = totalPrice / 0.9;
            System.out.println("Total harga (tanpa diskon): " + (int) originalPrice);
        }
    }
}