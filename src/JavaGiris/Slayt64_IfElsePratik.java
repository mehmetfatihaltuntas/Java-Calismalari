package JavaGiris;

import java.util.Scanner;

public class Slayt64_IfElsePratik {
    public static void main(String[] args) {

        // Girdi almak icin Scanner nesnemizi olusturuyoruz
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // SORU 2: Not Kontrolu (If-Else)
        // ==========================================

        System.out.println("--- Soru 2: Gecme/Kalma Durumu ---");
        System.out.println("Lutfen notunuzu giriniz (Orn: 75,5): ");
        double not = scanner.nextDouble();

        // Eger not 50'ye esit veya buyukse if blogu calisir.
        if (not>=50){
            System.out.println("Tebrikler dersi geçtiniz");
        }
        // Yukaridaki sart saglanmazsa (not 50'den kucukse) otomatik olarak else blogu calisir.
        else {
            System.out.println("Maalesef sinifta kaldiniz seneye artik");
        }

        // ==========================================
        // SORU 4: Buyuk Harf Kontrolu[cite: 1]
        // ==========================================
        System.out.println("\n--- Soru 4: Buyuk Harf Kontrolu ---");
        System.out.println("Lutfen bir karakter giriniz: ");
        // Scanner ile harf almak icin once metni (String) alir, sonra charAt(0) ile ilk karakterini cekeriz
        char karakter = scanner.next().charAt(0);

        // Karakterin buyuk harf olup olmadigini ASCII tablosundaki deger araligina gore kontrol edebiliriz
        // Buyuk harfler 'A' ile 'Z' arasindadir.
        if (karakter>='A'&&karakter<='Z'){
            System.out.println("Girdiginiz karakter BUYUK HARF");
        }else {
            System.out.println("Girdiginiz karakter buyuk harf DEGIL (Kucuk harf, rakam veya ozel sembol olabilir)");
        }




    }
}
