package CarpimTablosu;

import java.util.Arrays;
import java.util.Scanner;

public class CarpimTablosuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Ust siniri olusturmak icin bir sayi giriniz: ");
            int dimension = sc.nextInt();
            if (dimension>0 && dimension<=10) {
                int[][] tablo = new int[dimension][dimension];
                for (int i = 0; i < dimension; i++) {
                    for (int j = 0; j < dimension; j++) {
                        tablo[i][j]=(i+1)*(j+1);
                    }
                }
                for (int i = 0; i < dimension; i++) {
                    for (int j = 0; j < dimension; j++) {
                        System.out.printf("%4d", tablo[i][j]); // 4 boşluklu hizalama
                    }
                    System.out.println();
                }
            }else{
                System.out.println("Dogru aralikta bir deger girmediniz (0-11) ");
                sc.nextLine();
            }

        }



    }
}
