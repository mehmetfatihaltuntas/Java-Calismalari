package AhmetHocaDers.Ders05_StringManipulationSoruCozumu;

import java.util.Scanner;

public class C02_SifreKontrolu {
    public static void main(String[] args) {

        // Soru4 =  Kullanıcıdan bir şifre isteyip,
        //          Aşağıdaki sayıları kontrol edin
        //          ve kullanıcıya düzeltmesi gereken tüm eksikleri söyleyin,
        //          Eğer tüm şartları sağlarsa, "Şifre başarıyla kaydedildi" yazdırın
        //          - İlk harf küçük harf olmalı
        //          - son karakter rakam olmalı
        //          - Şifre boşluk içermemeli
        //          - Uzunluğu en az 10 karakter olmalı


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String sifre = scanner.nextLine();
        //          - İlk harf küçük harf olmalı
        char ilkHarf = sifre.charAt(0);
        int sayac =0;
        if (Character.isUpperCase(sifre.charAt(0))){  // harfin küçük yada büyük olduğunu ya ASCII table dan
                                                      // uada CHARACTER Wrapepr classından kotrol ederiz.
            System.out.println("İlk harf küçük harf olmalı");
            sayac++;
        }
        //          - son karakter rakam olmalı
        char sonKarakter = sifre.charAt(sifre.length()-1);
        if (!Character.isDigit(sonKarakter)){
            System.out.println("Son karakter rakam olmalı");
        }
        //          - Şifre boşluk içermemeli
        if (sifre.contains(" ")) {
            System.out.println("Şifre boşluk içermemelidir");
            sayac++;
        }
        if (sifre.length()<10){
            System.out.println("Şifre en az 10 karakter içermelidir.");
            sayac++;
        }
        else
            if (sayac==0) {
                System.out.println("Şifreniz başarıyla kaydedilmiştir");
            }



    }
}
