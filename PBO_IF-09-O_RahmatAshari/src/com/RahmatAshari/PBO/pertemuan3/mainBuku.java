package com.RahmatAshari.PBO.pertemuan3;

import java.util.Scanner;

public class mainBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("=== List Buku ===");

        // membuat objek buku
        Buku buku1 = new Buku(1, "Pemrograman Berbasis Objek dengan Java", "Indrajani", 2007, 70000);
        Buku buku2 = new Buku(2, "Dasar Pemrograman Java", "Abdul Kadir", 2004, 30000);

        buku1.tampilDetailBuku();
        buku2.tampilDetailBuku();

        System.out.println("=== List Buku ===");
        // memasukkan nomor buku
        System.out.print("Masukkan Nomor Buku Yang Ingin Dibeli  : ");
        int nomorBuku = input.nextInt();

        // memasukkan jumlah buku
        System.out.print("Masukkan Jumlah Buku Yang Ingin Dibeli : ");
        int jumlahBuku = input.nextInt();

        int totalHarga = beli_buku(nomorBuku, jumlahBuku);
        System.out.println("Total Harga : " + totalHarga);

        // masukkan jumlah bayar
        System.out.print("Masukkan Jumlah Bayar : ");
        int jumlahBayar = input.nextInt();

        bayar_buku(nomorBuku, jumlahBuku, totalHarga, jumlahBayar);
    }

    public static int beli_buku(int nomorBuku, int jumlahBuku) {
        int hargaBuku = 0;
        switch(nomorBuku) {
            case 1:
                hargaBuku = 70000;
                break;
            case 2:
                hargaBuku = 30000;
                break;
            default:
                System.out.println("Nomor Buku Yang Anda Masukkan Tidak Ada!");
        }
        return hargaBuku * jumlahBuku;
    }

    public static void bayar_buku(int nomorBuku, int jumlahBuku, int totalHarga, int jumlahBayar) {
        int kembalian = jumlahBayar - totalHarga;

        // menampilkan rincian pembian buku
        System.out.println("\n=== Rincian pembelian buku ===");
        System.out.println("No. Buku\t: " + nomorBuku);
        if(nomorBuku == 1) {
            System.out.println("Judul Buku\t: Pemrograman Berbasis Objek dengan Java");
            System.out.println("Pengarang\t: Indrajani");
            System.out.println("Tahun Terbit : 2007");
            System.out.println("Harga\t\t: 70000");
        } else if(nomorBuku == 2) {
            System.out.println("Judul Buku\t: Dasar Pemrograman Java");
            System.out.println("Pengarang\t: Abdul Kadir");
            System.out.println("Tahun Terbit : 2004");
            System.out.println("Harga\t\t: 30000");
        }
        System.out.println("\nJumlah Buku\t: " + jumlahBuku);
        System.out.println("Total Harga\t: " + totalHarga);
        System.out.println("=== Rincian pembelian buku ===");

        // menampilkan rincian pembayaran
        System.out.println("\n=== Rincian pembayaran ===");
        System.out.println("Jumlah Bayar\t: " + jumlahBayar);
        System.out.println("Kembalian\t\t: " + kembalian);
        System.out.println("=== Rincian pembayaran ===");
    }
}
