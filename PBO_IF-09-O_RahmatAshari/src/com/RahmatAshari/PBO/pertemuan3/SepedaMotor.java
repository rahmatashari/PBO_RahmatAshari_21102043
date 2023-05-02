package com.RahmatAshari.PBO.pertemuan3;

public class SepedaMotor {
/*
    //Atribut
    String merek;
    String tipe;
    int harga;
*/
    //Atribut
    private String merek;
    private String tipe;
    private int harga;


    //Constructor
    public SepedaMotor() {}

    public SepedaMotor(String merek, String tipe, int harga) {
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;
    }

    // method
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    //Method
    public void showInfo() {
        System.out.println("Merek : " + merek);
        System.out.println("Tipe : " + tipe);
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}
