package com.vtmc;

import java.util.Scanner;

public class U06 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Įveskite kiek kartų mokosi anglų kalbos");
        int n = reader.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite intervalo pradžios valandą");
            int val = reader.nextInt();
            System.out.println("Įveskite intervalo pradžios minutes");
            int min = reader.nextInt();
            System.out.println("Įveskite intervalo pabaigos valandą");
            int valPabaiga = reader.nextInt();
            System.out.println("Įveskite intervalo pabaigos minutes");
            int minPabaiga = reader.nextInt();
            int pradzia = gautiTrukmeMinutemis(val, min);
            int pabaiga = gautiTrukmeMinutemis(valPabaiga, minPabaiga);
            sum = sum + (pabaiga - pradzia);
        }
        System.out.println(gautiLaikoFormata(sum / 60, sum % 60));
    }

    public static int gautiTrukmeMinutemis(int val, int min) {
        return val * 60 + min;
    }

    public static String gautiLaikoFormata(int val, int min) {
        return val + " val. " + min + " min.";
    }
}
