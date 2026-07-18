package JavaGiris;

import java.util.Scanner;

public class Ders02_ScanenrPratik {
    public static void main(String[] args) {

        /*
Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
Isminiz : John
Soyisminiz : Doe
Yasiniz : 44
Kaydiniz basariyla tamamlanmistir.

Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
girilen bilgiler : J Doe, 44

Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
         */

        // Scanner objemizi olusturuyoruz ki disaridan veri alabilelim.
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // SORU 3: Kullanici Bilgilerini Formatli Yazdirma
        // ==========================================

        System.out.println("----Soru3 Form Kaydı----");
        System.out.println("Lütfen İsminizi Giriniz");
        // Metin alacağımız için next() veya nextLine() kullanırız.
        String isim = scanner.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();
        System.out.println("Lütfen yaşınızı giriniz ");
        int yas = scanner.nextInt();
        System.out.println("Kaydınız başarıyla oluşturulmuştur"+
                "\nİsminiz = "+isim+"\nSoyisminiz = "+soyisim+"\nYaşınız = "+yas);


        // ==========================================
        // SORU 5: Girilen İsmin baharfini alma (charAt(0))
        // ==========================================
        scanner.nextLine();
        System.out.println("----Soru5 İsmin baş harfi----");
        System.out.println("Lütfen İsminizi Giriniz");

        isim = scanner.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        soyisim = scanner.nextLine();
        System.out.println("Lütfen yaşınızı giriniz ");
        yas = scanner.nextInt();
        System.out.println("\nKaydınız başarıyla oluşturulmuştur"+
                "\n" +isim.charAt(0)+". "+soyisim+" "+yas);



        // ==========================================
        // SORU 7: Degiskenlerin Degerlerini Degistirme (Swap)
        // ==========================================

        System.out.println("\n---Swap yer değiştirme---");
        System.out.println("Birinci sayiyi giriniz (sayi1)");
        int sayi1 = scanner.nextInt();
        System.out.println("İinci sayiyi giriniz (sayi2)");
        int sayi2 = scanner.nextInt();
        System.out.println("\nDeğişimden ONCE -> sayi1 : " + sayi1 + " , sayi2 : " + sayi2);

        // Swap Mantığı : İki bardaktaki sıvıyı yer değiştirmek için 3. bir boş bardağa (temp) ihtiyacımız var.
        int temp = sayi1;       // sayi1'in değerini güvence altına aldık.
      //  System.out.println("temp : "+temp);
        sayi1 = sayi2;          // sayi1'in içine sayi2'nin değerini koyduk.
      //  System.out.println("sayi1 : "+sayi1+", sayi2 : "+sayi2);
        sayi2 = temp;           // sayi2'nin içine güvence altına aldığımız eski sayi1 değerini (temp) koyduk.
      //  System.out.println("sayi2 : "+sayi2+",  temp : "+temp);

        System.out.println("\nDeğişimden SONRA -> sayi1 : " + sayi1 + " , sayi2 : " + sayi2);


    }
}
