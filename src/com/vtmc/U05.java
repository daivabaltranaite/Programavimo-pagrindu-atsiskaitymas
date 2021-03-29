package com.vtmc;

import java.util.Scanner;

public class U05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Įvertinimas 1: ");
        int p1 = reader.nextInt();
        System.out.println("Įvertinimas 2: ");
        int p2 = reader.nextInt();
        System.out.println("Įvertinimas 3: ");
        int p3 = reader.nextInt();
        System.out.println(gautiGeriausiaIvertinima(p1, p2, p3));
    }

    public static int gautiGeriausiaIvertinima(int p1, int p2, int p3) {
        return Math.max(p1, Math.max(p2, p3));
    }
}
