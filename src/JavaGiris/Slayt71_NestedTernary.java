package JavaGiris;

import java.util.Scanner;

public class Slayt71_NestedTernary {
    public static void main(String[] args) {

        // Kullanicidan veri almak icin Scanner nesnemizi hazirliyoruz
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Slayt 71: Nested Ternary Mulakat Sorusu ---");
        System.out.print("Lutfen bir tam sayi giriniz: ");
        int sayi = scan.nextInt();

        // ==========================================
        // Nested Ternary ile Katmanli Karar Yapisi
        // ==========================================
        // Ana sartimiz: sayi > 0 (Sayı pozitif mi?)

        String sonuc = (sayi > 0) ?
                (sayi > 10 ? "Buyuk pozitif sayi" : "Kucuk pozitif sayi") :
                (sayi == 0 ? "Sifir" : "Negatif sayi");

        // Nihai sonucu konsola yazdiriyoruz
        System.out.println("Analiz Sonucu: " + sonuc);
    }
}
