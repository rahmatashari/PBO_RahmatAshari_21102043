package com.RahmatAshari.PBO.pertemuan3;

public class mainKoperasi {
    public static void main(String[] args) {
        // membuat objek koperasi pertama
        Koperasi koperasi1 = new Koperasi("Buku Tulis", 5000, 10, 50000);
        // mengisi method setter
        koperasi1.setNamaBarang("Buku Tulis");
        koperasi1.setHargaBarang(5000);
        koperasi1.setJumlahBarang(10);

        // membuat objek koperasi kedua
        Koperasi koperasi2 = new Koperasi("Pensil", 3000, 20, 60000);
        // mengisi method setter
        koperasi2.setNamaBarang("Pensil");
        koperasi2.setHargaBarang(3000);
        koperasi2.setJumlahBarang(20);

        // menampilkan detail barang
        System.out.println("== Koperasi Rafi Maju ==");
        koperasi1.tampilDetailBarang();
        System.out.println();
        koperasi2.tampilDetailBarang();

        // menghitung total harga semua barang
        int totalHarga = koperasi1.getTotalHarga() + koperasi2.getTotalHarga();
        System.out.println();
        System.out.println("Total Harga Semua Barang : " + totalHarga);
    }
}
