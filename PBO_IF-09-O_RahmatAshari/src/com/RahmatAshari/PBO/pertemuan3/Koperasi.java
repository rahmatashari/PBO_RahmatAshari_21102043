package com.RahmatAshari.PBO.pertemuan3;

public class Koperasi {
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;
    private int totalHarga;

    // constructor
    public Koperasi(String namaBarang, int hargaBarang, int jumlahBarang, int totalHarga) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.totalHarga = totalHarga;
    }

    // setter
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    // getter
    public String getNamaBarang() {
        return this.namaBarang;
    }

    public int getHargaBarang() {
        return this.hargaBarang;
    }

    public int getJumlahBarang() {
        return this.jumlahBarang;
    }

    // method untuk menghitung total harga barang
    public int getTotalHarga() {
        return this.hargaBarang * this.jumlahBarang;
    }

    // method untuk menampilkan detail barang
    public void tampilDetailBarang() {
        System.out.println("Nama Barang : " + this.namaBarang);
        System.out.println("Harga Satuan : " + this.hargaBarang);
        System.out.println("Jumlah Barang : " + this.jumlahBarang);
        System.out.println("Total Harga : " + this.getTotalHarga());
    }
}
