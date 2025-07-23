package UsHesabi;

import java.util.Scanner;

public class UsHesabiApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban sayisini giriniz: ");
        int base = sc.nextInt();
        System.out.print("Us/Kuvvet sayisini giriniz: ");
        int pow = sc.nextInt();


        System.out.println("Sonuc: " + powMet(base, pow));
    }

    static int powMet(int base, int pow) {
        if (pow > 0) {
            return base * powMet(base, pow-1);
        } else {
            return 1;
        }

    }
}
