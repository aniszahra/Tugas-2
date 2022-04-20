package com.oop.inheritance;

public class Karyawan {
    int divisi;
    String nama;
    int tahun;

    public void inti (String div, int nama, int th) {
        this.divisi = Integer.parseInt(div);
        this.nama = String.valueOf(nama);
        this.tahun = th;
    }

    int hitungGajiPokok(){
        int gaji_pokok = 0;
        if (this.divisi == 1){
            gaji_pokok = 1500000;
        } else {
            gaji_pokok = 3000000;
        }
        return gaji_pokok;
    }

    public void printKaryawan(){
        System.out.println("\n Nama pegawai : " + this.nama);
        System.out.println(" Divisi : " + this.divisi);
        System.out.println(" Gaji Pokok : Rp " + this.hitungGajiPokok());
    }
}
