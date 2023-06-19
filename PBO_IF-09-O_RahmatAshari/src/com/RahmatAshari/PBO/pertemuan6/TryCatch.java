package com.RafiZimraanLisfa.PBO.pertemuan6;

public class TryCatch {
    // Membuat method main
    public static void main(String[] args) {
        // Membuat array
        int[] angka = {1,2,3,4,5};

        // Memanggil index ke-4 dalam array
        System.out.println("Index ke 4 ada : ");
        try {
            // memanggil array berdasarkan index
            System.out.println(angka[4]);
            System.out.println();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(
                    "Index yang anda masukkan melebihi batas"
            );
        }

        // TryCatch
        System.out.println("Index ke 6 ngga ada : ");
        try {
            // memanggil array berdasarkan index
            System.out.println(angka[6]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(
                    "Index yang anda masukkan melebihi batas"
            );
        }

        System.out.println("Akhir dari program");
    }
}
