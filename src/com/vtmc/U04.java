package com.vtmc;

import java.util.Scanner;

public class U04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Įveskite intervalo pradžią: ");
        int pradzia = reader.nextInt();
        System.out.println("Įveskite intervalo pabaigą: ");
        int pabaiga = reader.nextInt();
        int reikalingiMarskineliai = 0;
        for (int i = pradzia; i <= pabaiga; i++) {
            if (i % 6 == 0) {
                reikalingiMarskineliai++;
            }
        }
        System.out.println("Reikalingų marškinėlių skaičius: " + reikalingiMarskineliai);

        reader.close();
    }
}
