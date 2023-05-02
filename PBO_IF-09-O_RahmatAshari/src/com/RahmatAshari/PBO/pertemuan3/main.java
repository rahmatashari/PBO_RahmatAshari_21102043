package com.RahmatAshari.PBO.pertemuan3;

public class main {
    public static void main(String[] args) {

        //Pembuatan Class
        SepedaMotor suzuki = new SepedaMotor("Suzuki", "GSX 150R", 20000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha", "YZF R15", 25000000);
        SepedaMotor honda = new SepedaMotor("Honda", "CBR 150R", 23500000);

/*
        //Pembuatan Class
        SepedaMotor suzuki = new SepedaMotor();
        SepedaMotor yamaha = new SepedaMotor();
        SepedaMotor honda = new SepedaMotor();

        //Mengisi Nilai Atribut Object Suzuki
        suzuki.merek = "Suzuki";
        suzuki.tipe = "GSX 150R";
        suzuki.harga = 20000000;

        //Mengisi Nilai Atribut Object Yamaha
        yamaha.merek = "Yamaha";
        yamaha.tipe = "YZF R15";
        yamaha.harga = 25000000;

        //Mengisi Nilai Atribut Object Honda
        honda.merek = "Honda";
        honda.tipe = "CBR 150R";
        honda.harga = 23500000;
*/
        //Menjalankan Method showInfo
        suzuki.showInfo();
        yamaha.showInfo();
        honda.showInfo();

        //Uji Coba Getter & Setter
        //Sebelum perubahan
        System.out.println(
                "Motor Merek : " + suzuki.getMerek() + ", Dengan tipe (before) : " + suzuki.getTipe()
        );
        //Melakukan proses perubahan tipe motor
        suzuki.setTipe("Satria FU");

        //Lihat hasil perubahan
        System.out.println(
                "Motor Merek : " + suzuki.getMerek() + ", Dengan tipe (after) : " + suzuki.getTipe()
        );

        //Uji Coba Getter & Setter Latihan di kelas
        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa Matic", 40000000);

        // Sebelum perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() + ", Dengan tipe (before) : " + vespa.getTipe()
        );
        // Melakukan proses perubahan tipe motor
        vespa.setTipe("Sprint");

        // Lihat hasil perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() + ", Dengan tipe (after) : " + vespa.getTipe()
        );
    }
}
