package PassworCheck;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        boolean w = true;

        while (w) {
            sb.setLength(0);
            System.out.print("Sifrenizi giriniz: ");
            sb.append(sc.nextLine());

            if (isFirstCharUpper(sb.toString())) {
                if (hasSpace(sb.toString())) {
                    if (has8Char(sb.toString())) {
                        while (true) {
                            System.out.print("Sifrenizi dogrulayin: ");
                            String paswCheck = sc.nextLine();
                            if (areInputsMatch(new StringBuilder(sb.toString()), new StringBuilder(paswCheck))) {
                                w = false;
                                break;
                            } else {
                                System.out.println("Girilen sifreler uyusmuyor.  ");

                            }
                        }

                    } else {
                        System.out.println("Sifre en az 8 karakter olmalidir");

                    }
                } else {
                    System.out.println("Sifre bosluk iceremez.");

                }
            } else {
                System.out.println("Sifre buyuk harfle baslamalidir.");

            }

        }
        System.out.println("Sifre basari ile olusturuldu.");


    }

    static boolean has8Char(String pasw) {

        int x = pasw.length();
        if (x >= 8) {
            return true;
        } else {
            return false;
        }

    }

    static boolean hasSpace(String passw) {

        return !passw.contains(" ");

    }

    static boolean isFirstCharUpper(String pass) {

        return Character.isUpperCase(pass.charAt(0));


    }

    static boolean areInputsMatch(StringBuilder input1, StringBuilder input2) {
        return input1.toString().equals(input2.toString());

    }
}
