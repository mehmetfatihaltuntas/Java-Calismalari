package JavaGiris;

import java.util.Scanner;

public class Ders05_StringContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // SENARYO 1: Basit contains() Kullanimi
        // ==========================================
        System.out.println("--- Senaryo 1: E-Posta Gecerlilik Kontrolu ---");
        System.out.print("Lutfen e-posta adresinizi giriniz: ");
        String email = scanner.nextLine();

        // email metninin icinde "@" ve "gmail.com" geciyor mu diye test ediyoruz
        if (email.contains("@")&&email.contains("gmail.com")){
            System.out.println("Gecerli bir email adresi girdiniz");
        }else
            System.out.println("Hata! Gecersiz e-posta formati.");

        // ==========================================
        // SENARYO 2: Method Chaining (Metod Zincirleme) ile QA Pratiği
        // ==========================================
        System.out.println("\n--- Senaryo 2: Metin Dogrulama (Assertion) ---");
        System.out.print("Sistem mesajini giriniz (Icinde 'basarili' kelimesi gecsin): ");
        String sistemMesaji = scanner.nextLine();

        // contains() buyuk/kucuk harf duyarlidir. "BASARILI" yazarsa false doner.
        // Bunu engellemek icin once toLowerCase() ile tum metni kucultuyoruz, sonra icinde ariyoruz.
        // Buna Java'da "Method Chaining" (Metodlari arka arkaya baglama) denir.
        boolean basariliMi = sistemMesaji.toLowerCase().contains("basarili");

        if (basariliMi == true){
            System.out.println("Test PASSED (Gecti): Sistem basari mesaji iceriyor.");
        }else
            System.out.println("Test FAILED (Kaldi): Sistem basari mesaji ICERMIYOR!");



    }
}
