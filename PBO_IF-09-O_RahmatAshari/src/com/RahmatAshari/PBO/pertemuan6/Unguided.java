package com.RafiZimraanLisfa.PBO.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unguided {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n>>> Rafi Zimraan Lisfa <<<");
        System.out.println("\t>>> 21102039 <<<");
        System.out.println();

        try{
            System.out.print("Masukkan Bilangan Pertama : ");
            int bilangan1 = input.nextInt();

            System.out.print("Masukkan Bilangan Kedua   : ");
            int bilangan2 = input.nextInt();

            if (bilangan2 != 0 ) {
                int hasil = jumlahBilangan(bilangan1, bilangan2);
                System.out.println("Hasil Penjumlahan : " + hasil);
            }else {
                System.out.println("Terjadi kesalahan : Pembagian dengan nol tidak diperbolehkan.");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Terjadi kesalahan : Input tidak valid. Harap masukkan bilangan bulat.");
        }
    }
    public static int jumlahBilangan(int bilangan1, int bilangan2){
        return bilangan1 + bilangan2;
    }
}
