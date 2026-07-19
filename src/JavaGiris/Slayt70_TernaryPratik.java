package JavaGiris;

import java.util.Scanner;

public class Slayt70_TernaryPratik {
    public static void main(String[] args) {

        // ==========================================
        // SORU 1: Ternary ile 5'in Kati Kontrolu
        // ==========================================
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Soru 1: Ternary ile 5'e Bolunebilme ---");
        System.out.print("Lutfen bir tam sayi giriniz: ");
        int sayi = scanner.nextInt();
        String sayiKontrolu = (sayi%5==0)?"Girilen sayı 5'in katıdır":"Girilen sayı 5'in katı degildir";
        System.out.println(sayiKontrolu);

        // ==========================================
        // SORU 2: Ternary ile Eskenar Ucgen Kontrolu
        // ==========================================
        System.out.println("\n--- Soru 2: Ternary ile Eskenar Ucgen ---");
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz:");
        System.out.print("kenar 1 : ");
        int kenar1 = scanner.nextInt();
        System.out.print("kenar 2 : ");
        int kenar2 = scanner.nextInt();
        System.out.print("kenar 3 : ");
        int kenar3 = scanner.nextInt();
        System.out.println((kenar1==kenar2&&kenar1==kenar3)?"Bu Ucgen Eskenardir":"EskenarUcgen degildir");

        // ==========================================
        // SORU 3: Küçük harfi Buyuk Harfe Cevirme
        // ==========================================
        System.out.println("\n--- Soru 3: Buyuk Harf Kontrolu ---");
        System.out.println("Lutfen bir harf girin:");
        char harf = scanner.next().charAt(0);
        String harfdegisimi = (harf>='a'&&harf<='z') ?
                "Harfin büyütülmüş hali : "+Character.toUpperCase(harf) :
                "Harfin kendisi : "+harf;
        System.out.println(harfdegisimi);

        // ==========================================
        // SORU 4: Ternary ile Gecme/Kalma Kontrolu
        // ==========================================
        System.out.println("--- Soru 4: Ternary ile Gecme/Kalma Kontrolu ---");
        System.out.print("Lutfen notunuzu giriniz (Orn: 75,5): ");

        // Not verisi ondalikli olabilecegi icin double tanimladik
        double not = scanner.nextDouble();

        // Ternary Operatoru ile tek satirlik karar mekanizmasi
        // Sart saglanirsa ? sonrasi, saglanmazsa : sonrasi String degiskene atanir.
        String sonucMesaji = (not >= 50) ? "Sinifi Gectin" : "Maalesef Kaldin";

        // Ekrana sonucu basiyoruz
        System.out.println("Durumunuz: " + sonucMesaji);


    }
}
