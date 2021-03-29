package com.vtmc;

import java.util.Scanner;

public class U03 {
    public static void main(String[] args) {
        int pradzia = -100;
        int pabaiga = -199;
        System.out.println("Ciklas for: ");
        for (int i = 0; (i + pradzia) >= pabaiga; i--) {
            if (i % 3 == 0) {
                System.out.print((i + pradzia) + " ");
            }
        }
        System.out.println();
        System.out.println("Ciklas while: ");
        int i = 0;
        while ((i + pradzia) >= pabaiga) {
            if (i % 3 == 0) {
                System.out.print((i + pradzia) + " ");
            }
            i--;
        }
    }
}
