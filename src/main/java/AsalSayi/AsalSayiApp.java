package AsalSayi;

import java.util.Scanner;

public class AsalSayiApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir yayi giriniz");
        int input = sc.nextInt();
        int x =prime(input,input);
        if (x == input) {
            System.out.println(input + " asaldir");
        }else{
            System.out.println(input + " asal degildir");
        }

    }

    static int prime(int primeNum, int input) {
        if (input == 1) {
            return input-1;
        }
        if (primeNum ==2) {
            return input;
        }

        if (input % (primeNum - 1) != 0) {
            return prime((primeNum - 1), input);
        }
        else if (input % (primeNum - 1) == 0) {
            return primeNum;
        } else {
            return input;
        }

    }


}
