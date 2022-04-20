package com.oop.inheritance;

public class Manager extends Karyawan {
    int hitungTunjangan(){
        int tunjangan = 0;
        if (this.tahun >= 0 && this.tahun <= 5){
            tunjangan = 300000 * this.tahun;
        } else{
            tunjangan = 550000 * this.tahun;
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
