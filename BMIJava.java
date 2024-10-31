/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmijava;

import java.util.Scanner;

public class BMIJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input berat badan (dalam kilogram)
        System.out.print("Masukkan berat badan Anda (kg): ");
        double berat = input.nextDouble();
        
        // Input tinggi badan (dalam meter)
        System.out.print("Masukkan tinggi badan Anda (m): ");
        double tinggi = input.nextDouble();
        
        // Hitung BMI
        double bmi = berat / (tinggi * tinggi);
        
        // Menentukan kategori BMI
        String kategori;
        if (bmi < 18.5) {
            kategori = "Kurus";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            kategori = "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            kategori = "Kelebihan berat badan";
        } else {
            kategori = "Obesitas";
        }
        
        // Tampilkan hasil
        System.out.printf("BMI Anda: %.2f\n", bmi);
        System.out.println("Kategori: " + kategori);
    }
}

