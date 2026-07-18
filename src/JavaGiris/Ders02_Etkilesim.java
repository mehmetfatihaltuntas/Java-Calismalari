package JavaGiris;

import java.util.Scanner;

public class Ders02_Etkilesim {

    public static void main(String[] args) {

        // ======================================
        // 1. BÖLÜM KULLANICIDAN VERİ ALMA
        // ======================================

        // 1. Adım Scanner class'inda var olan hazir method'lari kullanabilmek icin bir obje olusturmaliyiz
        Scanner scanner = new Scanner(System.in);

        // 2. Adım Kullanıcının kendisinden ne istendiğini bilmesi için bir açıklama yazdıralım
        System.out.println("Lütfen kilonuzu (kg cinsinden , örneğin 75) giriniz: ");

        // 3. Adım Kullanıcının girdiği değeri alabilmesi için uygun data türündeki bir variable'a atayalım
        // nextInt() bize kullanıcının girdiği tamsayıyı getirecektir
        int kilo = scanner.nextInt();

        System.out.println("Lütfen boyunuzu (metre cinsinden , örneğin 1,80) giriniz)");
        // Ondalıklı sayılar için nextDouble() kullanırız.
        double boy = scanner.nextDouble();

        System.out.println("Kaydedilen Kilo : "+kilo+" kaydedilen Boy : "+boy+" m");

        // ==========================================
        // 2. BÖLÜM: DATA CASTING (VERİ DÖNÜŞÜMÜ)
        // ==========================================

        System.out.println("\n--- Data Casting Islemleri ---");

        // Auto-Widening (Implicit Casting): Küçük data türünü büyüğe atama (Java Otomatik Yapar)
        byte kucuksayi = 12;
        int buyuksayi = kucuksayi;
        System.out.println("Otomatik Dönüşüm (byte -> int): " + buyuksayi);

        // Explict Narrowing (Manuel Casting) Büyük Data türünü Küçüğe atama (Bizim Onayımız gerekir)
        double ondaliklisayi = 45.99;
        // int tamSayi = ondaliklisayi; Bu satır HATA verir.
        int tamSayi = (int)ondaliklisayi; // Sorumluluğu alarak (int) yazıyoruz.  Ondalik kisim kaybolur.
        System.out.println("Manuel Dönüşüm (double --> int): " + tamSayi);

        // ==========================================
        // 3. BÖLÜM: WRAPPER CLASSES (SARMALAYICI SINIFLAR)
        // ==========================================

        System.out.println("\n--- Wrapper Class İşlemleri ---");

        // int ilkeldir, methodu yoktur. Integer ise Wrapper'dır, methodları vardır.
        int normalSayi = 10;
        Integer sarmalanmisSayi = 20;

        // Örneğin bir int değerin alabileceği en yüksek değeri Wrapper class ile kolayca bulabiliriz
        System.out.println("Integer'in alabileceği maksimum değer : " + Integer.MAX_VALUE);
        System.out.println("Integer'in alabileceği minimum değer : " + Integer.MIN_VALUE);

        // Karakerlerle (char) işlem yaparken Character Wrapper class'ı çok işimize yarar
        char krk = '5';
        System.out.println("Karakter bir rakam mı? : " + Character.isDigit(krk));           // True döner
        System.out.println("Karakter bir Alfabe mi ? : " + Character.isAlphabetic(krk));    // False döner


    }
}
