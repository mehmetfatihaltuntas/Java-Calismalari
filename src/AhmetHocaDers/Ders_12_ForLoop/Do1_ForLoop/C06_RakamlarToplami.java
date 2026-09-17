package AhmetHocaDers.Ders_12_ForLoop.Do1_ForLoop;

import java.util.Scanner;

public class C06_RakamlarToplami {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini asagidaki gibi yazdirin
        // input : 2345         output : 2+3+4+5  = 14
        //
        // output : "Girilen 2345  sayisinin rakamlar toplami : 14
        //
        // Kullacinin pozitif bir tamsiyi alip, rakamlar toplamini asagdaki gibi yazdirin
        // input : 1453          output : 1+4+5+3= 13
        //
        //output :  "Girilen 1453 sayisinin rakamlar toplami :13


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        int input = scanner.nextInt();
        int girilensayi = input;
        int toplam = 0;
        int basamakSayisi = (input+"").length();

        for (int i = 1; i <=basamakSayisi ; i++) {

            toplam +=input%10;
             input/=10;


        }
        System.out.println("Girdiğiniz "+ girilensayi+" sayisinin rakamlari toplami = " + toplam + " dir.");


        //
    }
}
