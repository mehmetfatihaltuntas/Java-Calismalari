package JavaGiris;

import java.util.Scanner;

public class Ders05_StringEquals {
    public static void main(String[] args) {
        // Kullanicidan girdi almak icin Scanner nesnemiz
        Scanner scan = new Scanner(System.in);

        // Sistemde kayitli olan orijinal veri
        String kayitliEmail = "fatih@mail.com";

        System.out.println("--- Ders 05: String equals() ve equalsIgnoreCase() ---");
        System.out.print("Lutfen e-posta adresinizi giriniz: ");
        String girilenEmail = scan.next();

        // ==========================================
        // 1. equals() Metodu Kontrolu
        // ==========================================
        // Karakterlerin birebir (buyuk/kucuk dahil) ayni olmasini bekler.
        boolean equalsSonuc = kayitliEmail.equals(girilenEmail);
        System.out.println("equals() ile sonuc: " + equalsSonuc);

        // ==========================================
        // 2. equalsIgnoreCase() Metodu Kontrolu
        // ==========================================
        // Buyuk/kucuk harf duyarliligini ortadan kaldirir, sadece metne odaklanir.
        boolean equalsIgnoreSonuc = kayitliEmail.equalsIgnoreCase(girilenEmail);
        System.out.println("equalsIgnoreCase() ile sonuc: " + equalsIgnoreSonuc);

    }
}
