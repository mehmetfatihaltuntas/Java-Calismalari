package JavaGiris;

public class Slayt29_WrapperPratik {
    public static void main(String[] args) {

        // ==========================================
        // 1. String İfadeleri Sayıya Dönüştürme
        // ==========================================

        System.out.println("---Strinden Sayiya Donusum---");

        // Ekranda veya dosyada yazi (String) olarak duran fiyatlar
        String fiyat1 = "100";
        String fiyat2 = "200";

        // Eğer onları doğrudan toplarsak Java bunlari dogrudan metin olarak yanyana birlestirir
        System.out.println("Metin olarak toplama (Yanlis): " + (fiyat1 + fiyat2)); // 100200 yazar

        // parseInt() ile String'i Integer objesine (Wrapper) ceviriyoruz
        Integer gercekfiyat = Integer.parseInt(fiyat1);

        // valueof() ile String'i Integer objesine (Wrapper) ceviriyoruz
        Integer gercekfiyat2 = Integer.valueOf(fiyat2);

        // Artık bu degiskenlerle gercek matematiksel islemler yapabiliriz
        int toplamFiyat = gercekfiyat+gercekfiyat2;
        System.out.println("Sayisal olarak gercek toplama : " + toplamFiyat);   // 300 yazar

        // ==========================================
        // 2. Character Metotları Kullanımı
        // ==========================================
        System.out.println("\n---Character Metotlari---");

        char harf = 'c';

        // to UpeperCase() methodu harfi buyutur
        char BuyukHarf=Character.toUpperCase(harf);
        System.out.println("Kucuk harf '" + harf + "' Buyutulmus Harf '" + BuyukHarf + "'");
        // isDigit() methodu karakterin rakam olup olmadigina bakar
        boolean rakamMi = Character.isDigit(harf);
        System.out.println("'" + harf + "' karakteri bir rakam mı? : " + rakamMi); // Harf olduğu için false

        char sayiKarakteri = '5';
        System.out.println("'" + sayiKarakteri + "' sayi karakteri bir rakam mi? : " + Character.isDigit(sayiKarakteri)); // Rakam oldugu icin true doner


    }
}
