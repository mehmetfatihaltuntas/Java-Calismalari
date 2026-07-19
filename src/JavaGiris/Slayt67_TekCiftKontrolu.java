package JavaGiris;

import java.util.Scanner;

public class Slayt67_TekCiftKontrolu {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int girilenSayi = scanner.nextInt();
        if (girilenSayi==0){
            System.out.println("Girilen sayı çiftdir ama negatif veya pozitif değildir");
        }

        else if (girilenSayi%2==0){
            if (girilenSayi%10==0){
                System.out.println("Girilen sayı çift ve 10'un katıdır");
            }else System.out.println("Girilen sayı çift ama 10'un katı değildir");

        }else if (girilenSayi%2!=0){
            if (girilenSayi>0){
                System.out.println("Girilen sayı tek ve pozitifdir");
            }else System.out.println("Girilen sayı tek ve negatiftir");

        }
    }
}
