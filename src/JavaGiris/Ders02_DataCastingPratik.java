package JavaGiris;

import java.util.Scanner;

public class Ders02_DataCastingPratik {
    public static void main(String[] args) {

        /*
        Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
                yazin
        Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin
        Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
                ile 127 arasindaki bir sayiya donusturup yazdirin.


         */

        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // SORU 1: Tam Sayilarin Ondalikli Ortalamasi
        // ==========================================

        System.out.println("--- Soru1 : Ortalama Hesaplama ---");
        int sayi1 = 14;
        int sayi2 = 20;
        int sayi3 = 25;

        // Eger (sayi1 + sayi2 + sayi3) / 3 yaparsak sonuc 19.666 degil, duz 19 cikar.
        System.out.println((sayi1 + sayi2 + sayi3) / 3); // 19

        // Kusurati korumak icin toplami islemden once (double) yazarak ondalikli yapiyoruz.
        double ortalama = (double)(sayi1 + sayi2 + sayi3) / 3;
        System.out.println("Uc sayinin ondalikli ortalamasi: " + ortalama);

        // ==========================================
        // SORU 2: Alfabede Sonraki 3 Harfi Bulma
        // ==========================================

        System.out.println("\n--- Soru 2: Sonraki Harfleri Bulma ---");
        System.out.print("Lutfen kucuk bir harf giriniz: ");

        // Scanner'da dogrudan 'char' alma metodu yoktur. Metin alip ilk harfini seceriz.
       // String harf = scanner.next().charAt(0);
        char harf = scanner.next().charAt(0);

        // char verisine sayi ekledigimizde sonuc ASCII tablosuna gore 'int' (tam sayi) olur.
        // Bu sayiyi tekrar karaktere dondurmek icin (char) parantezini (Explicit Casting) kullaniriz
        char harf2 = (char)(harf+1);
        char harf3 = (char)(harf+2);
        char harf4 = (char)(harf+3);

        System.out.println("Girdiğiniz harf : "+harf);
        System.out.println("Sonraki 3 harf : " + harf2 + ", " + harf3 + ", " + harf4);

        // ==========================================
        // SORU 3: Tam Sayilarin ExplicitCasting
        // ==========================================


        System.out.println("--- Soru 3: Veri Sinirlarini Zorlama (Explicit Casting) ---");

        // 1. Adim: Kullanicidan herhangi bir tam sayi isteyelim
        System.out.print("Lutfen herhangi bir tam sayi giriniz (Orn: 300, 500): ");
        int girilenSayi = scanner.nextInt();

        // 2. Adim: Explicit Narrowing (Manuel Donusum)
        // int degerini byte sinirlarina (-128 ile 127) zorluyoruz.
        // Sorumlulugu almak icin degerin onune (byte) yaziyoruz[cite: 1].
        byte donusturulenSayi = (byte) girilenSayi;

        // 3. Adim: Sonuclari yazdiralim ve aradaki farki gorelim
        System.out.println("\n--- Sonuclar ---");
        System.out.println("Girdiginiz Orijinal Sayi (int): " + girilenSayi);
        System.out.println("Byte Sinirlarina Sikistirilmis Hali: " + donusturulenSayi);

        System.out.println("\nNot: Eger girdiginiz sayi -128 ile 127 arasindaysa degisim olmaz.");
        System.out.println("Ancak bu sinirlardan buyukse, veri kaybi yasanir ve sonuc degisir.");


    }

}
