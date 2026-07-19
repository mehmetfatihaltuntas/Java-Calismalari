package JavaGiris;

import java.util.Scanner;

public class Slayt74_SwitchHesapMakinesi {
    public static void main(String[] args) {
        // ==========================================
        // Switch Yapisi ile Hesap Makinesi Yapma
        // ==========================================

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Slayt 74-75: Switch ile Hesap Makinesi ---");
        System.out.print("Lutfen işlem yapmak istediğiniz sayıyı giriniz: ");
        System.out.print("\n1. Sayı : ");
        int sayi1 = scanner.nextInt();
        System.out.print("2. Sayı : ");
        int sayi2 = scanner.nextInt();
        System.out.println("Lütfen yapmak istediğiniz islem turunu seciniz  (/ = Bölme, + = Toplama, - = Cıkarma, * = Carpma )");
        char karakter = scanner.next().charAt(0);
        switch (karakter) {
            case '/':
                // Sifira bolunme hatasini engelleyen QA guvenlik kontrolu (Edge Case)
                if (sayi2 != 0) {
                    System.out.println("Sonuc: " + sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2));
                } else {
                    System.out.println("Hata: Bir sayi sifira bolunemez! Tanimsiz sonuc.");
                }
                break; // Eger break yazmazsak, kod durmaz ve alt satirdaki durumlari da calistirir!
            case '*':
                System.out.println("Çarpım Sonuc : " + sayi1 * sayi2);
                break;
            case '-':
                System.out.println("Çıkarma Sonuc : " + (sayi1 - sayi2));
                break;
            case '+':
                System.out.println("Toplama Sonuc : " + (sayi1 + sayi2));
                break;

            default:
                // Yukaridaki case'lerden hicbiriyle eslesme saglanmazsa burasi calisir (if-else'deki else gibi).
                System.out.println("Gecersiz bir operator girdiniz! Lutfen +, -, * veya / kullanin.");
        }
    }
}
