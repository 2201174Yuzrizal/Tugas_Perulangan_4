/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perulangan;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        
        tampilkanPrimaKomposit(batasAwal, batasAkhir);

        scanner.close();
    }

   
    public static void tampilkanPrimaKomposit(int batasAwal, int batasAkhir) {
        System.out.println("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Bilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!isPrima(i) && i != 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    public static boolean isPrima(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
