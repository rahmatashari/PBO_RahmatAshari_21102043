package com.RahmatAshari.PBO.pertemuan2;

import java.util.Scanner;

public class Unguided1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("== Program Menampilkan Bilangan Genap ==");
        System.out.print("Masukkan batas bilangan : ");
        int batas = input.nextInt();

        for (int i = 2; i <= batas; i++) {
            if (i % 2 == 0) {
                System.out.println("Bilangan Genap : " + i);
            }
        }
    }
}


