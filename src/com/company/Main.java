package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        for (int i = 2; i <= 100; ++i) {
            if (ProstoeCHislo(i) == true) {
                System.out.print(i + " ");
            }
        }

    }

    public static boolean ProstoeCHislo(int CHislo) {
        int Delitel = CHislo;
        while (Delitel != 0) {
            if ((CHislo % Delitel == 0) && (Delitel != CHislo) && (Delitel != 1)) {
                return false;
            }
            --Delitel;
        }
        return true;

    }
}
