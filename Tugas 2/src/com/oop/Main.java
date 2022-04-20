package com.oop;
import java.util.Scanner;
import com.oop.inheritance.*;

public class Main {

    public static void main(String[] args) { menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n===========================================================");
        System.out.println("\n|                  PROGRAM GAJI KARYAWAN                  |");
        System.out.println("\n===========================================================");
        System.out.println("\nDivisi Karyawan: 1=Manager / 2=Kasir");
        System.out.println("\nMasukan Divisi Karyawan: ");
        int divisi = input.nextInt();

        if (divisi == 1){
            System.out.println(" Masukan Nama: ");
            String nama = input.next();
            System.out.print(" Masukan Lama Waktu Menjadi Karyawan (tahun): ");
            int th = input.nextInt();

            Manager p2 = new Manager();
            p2.printKaryawan("\n Berikut ini rinciannya: ");
        }else if (divisi == 2) {
            System.out.println(" Masukan Nama: ");
            String nama = input.next();
            System.out.print(" Masukan Lama Waktu Menjadi Karyawan (tahun): ");
            int th = input.nextInt();

            Kasir p2 = new Kasir();
            p2.printKaryawan("\n Berikut ini rinciannya: ");
        }else {
            Main.menu();
        }

        System.out.print("\n--------------------------------------------------------");
        System.out.print("\n Ketik 1, untuk mengulang program ");
        System.out.print("\n Ketik 0, untuk keluar program");
        System.out.print("\n Masukan Pilihan: ");
        int pil = input.nextInt();

        if (pil == 1){
            Main.menu();
        }else {
            System.exit(0);
        }
    }
}
