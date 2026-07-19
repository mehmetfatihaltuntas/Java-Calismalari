package JavaGiris;

import java.util.Scanner;

public class Slayt67_TatilHesaplama {

    public static void main(String[] args) {

        // Kullanicidan veri almak icin Scanner objemizi olusturuyoruz
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Slayt 67 Soru 4: Tatil Gunu Hesaplama ---");
        System.out.print("Lutfen bulundugunuz gunu giriniz (Orn: Pazartesi): ");
        String gun = scan.next();

        // ==========================================
        // If-Else If Algoritmasi ile Gun Kontrolu
        // ==========================================

        // equalsIgnoreCase() metodu buyuk/kucuk harf ayrimini ortadan kaldirir[cite: 1].
        // Yani "pazartesi", "Pazartesi" veya "PAZARTESI" ayni kabul edilir.
        if (gun.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Simdi calisma zamani tatile 5 gun var");
        } else if (gun.equalsIgnoreCase("Sali")) {
            System.out.println("Simdi calisma zamani tatile 4 gun var");
        } else if (gun.equalsIgnoreCase("Carsamba")) {
            System.out.println("Simdi calisma zamani tatile 3 gun var");
        } else if (gun.equalsIgnoreCase("Persembe")) {
            System.out.println("Simdi calisma zamani tatile 2 gun var");
        } else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Simdi calisma zamani tatile 1 gun var");
        } else if (gun.equalsIgnoreCase("Cumartesi") || gun.equalsIgnoreCase("Pazar")) {
            // Hafta sonu durumu icin OR (|| - VEYA) operatoru ile iki sarti tek satirda birlestirdik
            System.out.println("Simdi dinlenme zamani");
        } else {
            // Gecerli bir gun girilmezse kullaniciyi uyariyoruz
            System.out.println("Gecersiz bir gun ismi girdiniz. Lutfen tekrar deneyin.");
        }
    }
}