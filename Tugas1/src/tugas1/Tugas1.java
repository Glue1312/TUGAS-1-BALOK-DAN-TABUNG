/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author Silvester
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String[] args) {
        boolean ulang = true;
        Scanner input = new Scanner(System.in);
        while (ulang) {
            System.out.println("==========");
            System.out.println("MENU UTAMA");
            System.out.println("==========");

            System.out.println("Pilih bangun ruang yang akan dihitung:");
            System.out.println("1. Balok");
            System.out.println("2. Tabung");
            System.out.println("3. Exit");

            int pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();

                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                 Balok balok = new Balok(panjang,lebar,tinggi);
                System.out.println("Luas Persegi Panjang "+ balok.luasbidang());
                System.out.println("Keliling Persegi Panjang"+ balok.keliling());
                System.out.println("Volume balok adalah " + balok.volume());
                System.out.println("Luas permukaan balok adalah " + balok.luasbidang(tinggi));
            } else if (pilihan == 2) {
                System.out.print("Masukkan jari-jari: ");
                double jariJari = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                Tabung tabung = new Tabung(jariJari,tinggi);
                System.out.println("Luas Lingkaran adalah "+ tabung.luasbidang());
                System.out.println("Keliling Lingkaran adalah "+ tabung.keliling());
                System.out.println("Volume tabung adalah " + tabung.volume());
                System.out.println("Luas permukaan tabung adalah " + tabung.luasbidang(tinggi));
            } else if (pilihan == 3) {
                ulang = false;
                break;

            } else {
                System.out.println("Pilihan tidak valid.");
            }
            System.out.println("Ulangi?y/t");
            char kembali = input.next().charAt(0);
            if (kembali=='y'){
               ulang = true;
            }
            else {
                ulang = false;
            }
        }
    }
}
