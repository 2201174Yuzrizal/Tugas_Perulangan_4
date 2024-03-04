/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perulangan;


import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan nilai N (antara 1 sampai 1000): ");
        int N = scanner.nextInt();

       
        cetakPola(N);

        scanner.close();
    }

    // 
    public static void cetakPola(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}


