/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perulangan;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            
            System.out.println("Masukkan tiga bilangan bulat:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

           
            boolean isRibuan = cekRibuan(num1) && cekRibuan(num2) && cekRibuan(num3);

            
            if (isRibuan) {
                System.out.println("Semua bilangan adalah ribuan.");
            } else {
                System.out.println("Tidak semua bilangan adalah ribuan.");
            }

           
            System.out.println("Apakah Anda ingin memasukkan tiga bilangan bulat lagi? (ya/tidak)");
            String input = scanner.next();
            continueInput = input.equalsIgnoreCase("ya");
        }

        scanner.close();
    }

    
    public static boolean cekRibuan(int num) {
        
        return num > 999 && num < 10000;
    }
}

