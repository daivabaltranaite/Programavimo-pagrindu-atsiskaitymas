package com.vtmc;

import java.util.Scanner;

public class U01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kiek pamokų pirmadienį? ");
        int pirmadienis = reader.nextInt();
        System.out.println("Kiek pamokų antradienį? ");
        int antradienis = reader.nextInt();
        System.out.println("Kiek pamokų treciadienį? ");
        int treciadienis = reader.nextInt();
        System.out.println("Kiek pamokų ketvirtadienį? ");
        int ketvirtadienis = reader.nextInt();
        System.out.println("Kiek pamokų penktadienį? ");
        int penktadienis = reader.nextInt();
        int pamokuSkaicius = pirmadienis + antradienis + treciadienis + ketvirtadienis + penktadienis;
        System.out.println("Pamokų skaičius: " + pamokuSkaicius);
        int minutes = pamokuSkaicius * 45;
        System.out.println("Tai sudaro minučių: " + minutes);
    }
}
