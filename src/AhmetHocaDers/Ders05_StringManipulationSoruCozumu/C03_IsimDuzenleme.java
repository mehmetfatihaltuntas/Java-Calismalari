package AhmetHocaDers.Ders05_StringManipulationSoruCozumu;

import java.util.Scanner;

public class C03_IsimDuzenleme {
    // Kullanıcıdan isim ve soyismini ayrı ayrı alın
    // - isim daha uzun ise,
    // isim ve soyismi ilk harf büyük diğer kalanları küçük şeklinde yazdırın
    // - Soyisim daha uzun ise,
    // İsmi ilk harf büyük diğerleri küçük, soyismin tamamını büyük harfle yazdırı


    public static void main(String[] args) {
        // Kullanıcıdan isim ve soyismini ayrı ayrı alın
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String Isim = scanner.nextLine();
        System.out.println("Lütfen soy isminizi giriniz");
        String soyIsim = scanner.nextLine();

        // - isim daha uzun ise,
        // isim ve soyismi ilk harf büyük diğer kalanları küçük şeklinde yazdırın

        char isimIlkBuyukHarf = Character.toUpperCase(Isim.charAt(0));
        char soyisimIlkBuyukHarf = Character.toUpperCase(soyIsim.charAt(0));



        if (Isim.length()>soyIsim.length()){
 //           System.out.println(isimIlkBuyukHarf+Isim.substring(1).toLowerCase()+" "+soyisimIlkBuyukHarf+soyIsim.substring(1).toLowerCase());
            System.out.println(Isim.substring(0,1).toUpperCase()+Isim.substring(1).toLowerCase()+" "+soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase());
            // - Soyisim daha uzun ise,
            // İsmi ilk harf büyük diğerleri küçük, soyismin tamamını büyük harfle yazdırın
        } else if (Isim.length()<soyIsim.length()) {
 //           System.out.println(isimIlkBuyukHarf+Isim.substring(1).toLowerCase()+" "+soyIsim.toUpperCase());
           System.out.println(Isim.substring(0,1).toUpperCase()+Isim.substring(1).toLowerCase()+" "+soyIsim.toUpperCase());


        }

    }

}
