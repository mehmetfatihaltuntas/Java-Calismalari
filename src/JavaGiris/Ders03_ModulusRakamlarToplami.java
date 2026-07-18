package JavaGiris;

import java.util.Scanner;

public class Ders03_ModulusRakamlarToplami {

    public static void main(String[] args) {
        // Kullanicidan veri almak icin Scanner objemizi olusturuyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- 4 Basamakli Sayinin Rakamlar Toplamini Bulma ---");

        // Kullanicidan 4 basamakli bir sayi aliyoruz
        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz (Orn: 1469): ");
        int sayi = scanner.nextInt();

        // Asil sayimizi kaybetmemek icin, islemleri yapacagimiz gecici bir degisken olusturalim
        int islenecekSayi = sayi;

        // Rakamlari toplayip icinde biriktirecegimiz degisken (Sepetimiz)
        int rakamlarToplami = 0;

        // Her adimda elde edecegimiz tekil rakami tutacak degisken
        int birlerBasamagi = 0;

        // ==========================================
        // 1. ADIM: Birler basamagini isleme
        // ==========================================
        birlerBasamagi = islenecekSayi%10; // Orn: 1469 % 10 = 9
        rakamlarToplami = rakamlarToplami+birlerBasamagi; // Sepete ekledik. Toplam = 9
        islenecekSayi = islenecekSayi/10;  // Son basamagi atiyoruz. Yeni sayi: 146

        // ==========================================
        // 2. ADIM: Onlar basamagini isleme
        // ==========================================
        birlerBasamagi = islenecekSayi%10;
        rakamlarToplami = rakamlarToplami+birlerBasamagi; // Sepete ekledik. Toplam = 9 + 6 = 15
        islenecekSayi = islenecekSayi/10; // Son basamagi atiyoruz. Yeni sayi: 14

        // ==========================================
        // 3. ADIM: Yuzler basamagini isleme
        // ==========================================
        birlerBasamagi = islenecekSayi%10;
        rakamlarToplami = rakamlarToplami+birlerBasamagi; // Sepete ekledik Toplam = 9+6+4 = 19
        islenecekSayi = islenecekSayi/10; // Son basamagi atiyoruz. Yeni sayi: 1

        // ==========================================
        // 4. ADIM: Binler basamagini isleme
        // ==========================================
        birlerBasamagi = islenecekSayi%10; // 1 % 10 = 1
        rakamlarToplami = rakamlarToplami+birlerBasamagi; // Sepete ekledik Toplam =9+6+4+1 = 20
        islenecekSayi = islenecekSayi/10; // Son basamagi atiyoruz. Yeni sayi: 0

        // ==========================================
        // SONUCU YAZDIRMA
        // ==========================================
        System.out.println("Girdiginiz " + sayi + " sayisinin rakamlar toplami: " + rakamlarToplami);















    }
}
