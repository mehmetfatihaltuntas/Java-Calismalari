package JavaGiris;

import java.util.Scanner;

public class BolmeVeCasting {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
                isleminin sonucununun tamsayi kismini yazdirin.
        Soru 5- Kullanicidan bir double, bir  tamsayi alin, double sayiyi ikinci sayiya bolun
                ve bolum isleminin sonucununun tamsayi kismini yazdirin.
         */

        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // SORU 4: Iki Double Sayiyi Bolme ve Int'e Cevirme[cite: 1]
        // ==========================================

        System.out.println("--- Soru 4: Double / Double Islemi ---");
        System.out.println("Lutfen 1. ondalikli sayiyi giriniz (Orn: 15,7): ");
        double ciftOndalikliSayi1 = scanner.nextDouble();
        System.out.println("Lutfen 2. ondalikli sayiyi giriniz (Orn: 3,7): ");
        double ciftOndalikliSayi2 = scanner.nextDouble();

        // Iki double sayinin bolumu double cikar. Sadece tam sayi kismini almak icin (int) ile casting yapiyoruz
        int bolumTamsayiSonuc = (int)(ciftOndalikliSayi1/ciftOndalikliSayi2);
        System.out.println("Bolumun sadece tam sayi kismi: " + bolumTamsayiSonuc);

        // ==========================================
        // SORU 5: Double Sayiyi Int Sayiya Bolme
        // ==========================================

        System.out.println("\n--- Soru 5: Double / Int Islemi ---");
        System.out.print("Lutfen bolunecek ondalikli sayiyi giriniz (Orn: 25,8): ");
        double ondalikliSayi = scanner.nextDouble();
        System.out.print("Lutfen bolunecek tam sayiyi giriniz (Orn: 3): ");
        int tamSayi = scanner.nextInt();

        // Bir double ile bir int isleme girdiginde Java sonucu her zaman genis olan (double) turunde verir.
        // Bu yuzden yine (int) casting islemine ihtiyacimiz var
        int sonuc = (int)(ondalikliSayi/tamSayi);
        System.out.println("Bolumun sadece tam sayi kismi: "+sonuc);


    }
}
