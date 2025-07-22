package SayiYuvarlama;

import java.util.Scanner;

public class YuvarlamaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        double sayi = sc.nextDouble();
        System.out.println("Yukarı Yuvarlama "+Math.ceil(sayi));
        System.out.println("Aşağı Yuvarlama: "+Math.floor(sayi));
        System.out.println("En yakin tam sayi: "+Math.round(sayi));
    }
}
