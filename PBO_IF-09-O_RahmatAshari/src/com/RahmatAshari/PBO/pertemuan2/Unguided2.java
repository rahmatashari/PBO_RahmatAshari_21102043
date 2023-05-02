package com.RahmatAshari.PBO.pertemuan2;

import java.util.Scanner;

public class Unguided2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Nama
        System.out.println("== Program Form Pendaftaran Mahasiswa Baru ==");
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        // Validasi Nama
        if (nama.isEmpty()) {
            System.out.println("<> Nama Tidak Boleh Kosong");
            return;
        }

        // Input Umur
        System.out.print("Masukkan Umur : ");
        int umur = input.nextInt();

        // Validasi Umur
        if (umur < 17) {
            System.out.println("<> Umur Anda Belum Cukup");
            return;
        }

        // Menu Pilih Jurusan
        System.out.println("\n=> Pilih Jurusan :");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Rekayasa Perangkat Lunak");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = input.nextInt();

        // Percabangan Untuk Menentukan Jurusan
        String jurusan;
        if (pilihan == 1) {
            jurusan = "Teknik Informatika";
        } else if (pilihan == 2) {
            jurusan = "Sistem Informasi";
        } else if (pilihan == 3) {
            jurusan = "Rekayasa Perangkat Lunak";
        } else {
            System.out.println("<> Pilihan Tidak Tersedia");
            return;
        }

        // Menampilkan Hasil Pendaftaran
        System.out.println("\n== Data Pendaftaran ==");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");
        System.out.println("Jurusan : " + jurusan);
    }
}

