package JavaGiris;

import java.util.Scanner;

public class Ders05_StringCharAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Ders 05: charAt() ile Ilk ve Son Harfi Bulma ---");
        System.out.println("Lütfen bir kelime veya cumle giriniz : ");
        String metin = scanner.nextLine();

        // ==========================================
        // Ilk Karakteri Bulma
        // ==========================================
        // Java'da indeksler 0'dan baslar. Bu yuzden ilk harf her zaman 0. indekstedir.
        char ilkHarf = metin.charAt(0);
        System.out.println("Girdiginiz metnin ilk harfi : " + ilkHarf);

        // ==========================================
        // Son Karakteri Bulma (Mulakat Teknigi)
        // ==========================================
        // Toplam uzunluktan 1 cikararak son harfin indeksini dinamik olarak buluyoruz.
        int sonIndex = metin.length()-1;
        char sonHarf = metin.charAt(sonIndex);
        System.out.println("Girdiginiz metnin son harfi : " + sonHarf);



    }
}
