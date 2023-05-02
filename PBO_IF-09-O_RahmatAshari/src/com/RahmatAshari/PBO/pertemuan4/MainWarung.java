package com.RahmatAshari.PBO.pertemuan4;

import java.util.Scanner;

public class MainWarung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Inisial menu
        WarungMakan wm = new WarungMakan();
        Menu m = new Menu();
        Menu m1 = new Menu();
        Menu m2 = new Menu();
        Menu m3 = new Menu();

        wm.nama_warung = "Nasi Goreng Rahmat";
        wm.alamat = "Jl. Bekasi 69";
        wm.no_telp = "089521304";

        m1.no_makanan = 1;
        m1.nama_makanan = "Nasi Goreng";
        m1.harga = 10000;
        m1.stock = 10;

        m2.no_makanan = 2;
        m2.nama_makanan = "Nasi Goreng Spesial";
        m2.harga = 15000;
        m2.stock = 4;

        m3.no_makanan = 3;
        m3.nama_makanan = "Nasi Goreng Spesial + Telur";
        m3.harga = 20000;
        m3.stock = 20;

        wm.detailWarung();
        m1.detailMakanan();
        m2.detailMakanan();
        m3.detailMakanan();

        System.out.print("Masukkan Nomor Makanan : ");
        m.no_makanan = input.nextInt();

        // Menggunakan Percabangan
        // Untuk memilih menu 1
        if (m.no_makanan == 1) {
            System.out.print("Masukkan Jumlah Makanan : ");
            wm.beliMakanan(m1, input.nextInt());
            m1.totalHarga();
            wm.cekStok(m1);
            // Untuk memimilih menu 2
        } else if (m.no_makanan == 2) {
            System.out.print("Masukkan Jumlah Makanan : ");
            wm.beliMakanan(m2, input.nextInt());
            m2.totalHarga();
            wm.cekStok(m2);
            // Untuk memimilih menu 3
        } else if (m.no_makanan == 3) {
            System.out.print("Masukkan Jumlah Makanan : ");
            wm.beliMakanan(m3, input.nextInt());
            m2.totalHarga();
            wm.cekStok(m3);
        }
        // Berhenti memilih menu
        input.close();
    }
}

