package com.vtmc;

import static com.vtmc.AlgoritmaiDaiva.print;
import static com.vtmc.AlgoritmaiDaiva.equals2;

public class TestAlgoritmaiDaiva {
    public static void main(String[] args) {
        int[] masyvas1 = {1, 2, 3, 4};
        int[] masyvas2 = {1, 2, 3, 4, 5, 6, 7};
        int[] masyvas3 = {1, 2, 3, 4};
        print(masyvas1);
        print(masyvas2);
        print(masyvas3);

        System.out.println(equals2(masyvas1, masyvas2));
        System.out.println(equals2(masyvas2, masyvas3));
        System.out.println(equals2(masyvas3, masyvas1));
    }
}
