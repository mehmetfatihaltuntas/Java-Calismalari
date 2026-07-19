package JavaGiris;

import java.util.Scanner;

public class Ders05_StringSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // SENARYO 1: Isim Formatlama (Ilk harf buyuk, gerisi kucuk)
        // ==========================================
        System.out.println("--- Senaryo 1: substring() ile Metin Formatlama ---");
        System.out.print("Lutfen isminizi rastgele buyuklukte giriniz (Orn: fAtIh): ");
        String isim = scanner.nextLine();

        // 0. indeksten 1. indekse kadar (1 haric) alir ve buyutur -> Sadece ilk harf
        String ilkHarfBuyuk = isim.substring(0,1).toUpperCase();

        // 1. indeksten baslar sonuna kadar alir ve kucultur -> Geri kalan harfler
        String digerHarflerKucuk = isim.substring(1).toLowerCase();

        String formatliIsim = ilkHarfBuyuk+digerHarflerKucuk;
        System.out.println("Sisteme kaydedilen formatli isminiz: " + formatliIsim);

        // ==========================================
        // SENARYO 2: Otomasyon Testi - Siparis Numarasi Cekme
        // ==========================================
        System.out.println("\n--- Senaryo 2: substring() ile Veri Cekme ---");

        // Ekranda beliren dinamik bir uyari mesaji oldugunu varsayalim
        String bildirimMesaji = "Siparisiniz alindi. Takip no: 847291. Tesekkurler!";
        System.out.println("Gelen Mesaj: " + bildirimMesaji);
        // Takip numarasi "Takip no: " metninden sonra basliyor.
        // Sayarak buldugumuzda 8 rakami 30. indekste basliyor. Sayi 6 haneli oldugu icin 36. indekste bitiyor.
        // 36 haric (exclusive) oldugu icin tam olarak 847291 alinir.
        String takipNo = bildirimMesaji.substring(30,36);
        System.out.println("Sistemden başarıyla cekilen takip numarasi : " + takipNo);


    }
}
