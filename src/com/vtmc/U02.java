package com.vtmc;

import java.util.Scanner;

public class U02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Įveskite dėžių skaičių: ");
        int deziuSk = reader.nextInt();
        System.out.println("Įveskite knygų skaičių: ");
        int knyguSk = reader.nextInt();
        System.out.println("Įveskite, kelios knygos telpa į dėžę: ");
        int dezesTalpa = reader.nextInt();
        int visuDeziuTalpa = deziuSk * dezesTalpa;
        int knyguSkKuriosNetilpo = knyguSk - visuDeziuTalpa;
        if (knyguSkKuriosNetilpo > 0) {
            System.out.println("Knygos netelpa į dėžes.");
            System.out.println("Į dėžes netilpo " + knyguSkKuriosNetilpo + " knygos/-a/-ų.");
        } else {
            System.out.println("Knygos telpa į dėžes.");
        }
    }
}
