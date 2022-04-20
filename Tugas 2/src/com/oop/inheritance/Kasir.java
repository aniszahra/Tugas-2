package com.oop.inheritance;

public class Kasir extends Karyawan {

    int hitungTunjangan(){
        int tunjangan;
        if (this.tahun >= 0 && this.tahun <=5){
            tunjangan = 150000 * this.tahun;
        }else {
            tunjangan = 200000 * this.tahun;
        }
        return tunjangan;
    }

    int hitungTotalGaji(){
        int total;
        total = this.hitungGajiPokok() + this.hitungTunjangan();
        return total;
    }

    public void printKaryawan(String rincian){
        System.out.println(" " + rincian);
        System.out.println(" Nama Pegawai           : " + this.nama);
        System.out.println(" Divisi                 : " + this.divisi);
        System.out.println(" Gaji Pokok             : Rp " + this.hitungGajiPokok());
        System.out.println(" Tunjangan              : Rp " + this.hitungTunjangan());
        System.out.println(" Total Gaji             : Rp " + this.hitungTotalGaji());
    }
}
