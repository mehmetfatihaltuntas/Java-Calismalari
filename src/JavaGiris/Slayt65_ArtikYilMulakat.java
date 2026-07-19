package javaGiris;

import java.util.Scanner;

public class Slayt65_ArtikYilMulakat {

    public static void main(String[] args) {

        // Kullanicidan veri almak icin Scanner nesnemizi hazirliyoruz
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Mülakat Sorusu: Artik Yil Kontrolu ---");
        System.out.print("Lutfen bir yil giriniz (Orn: 2000, 2024, 2100): ");
        int yil = scan.nextInt();

        // 1. ADIM: Ana kontrol - Yil 4'e tam bolunuyor mu?
        if (yil % 4 == 0) {

            // Yil 4'e bolunuyor, simdi 100 sarti kontrol ediliyor (Nested If)
            if (yil % 100 == 0) {

                // Yil hem 4'e hem 100'e bolunuyor. Artik yil olmasi icin tek sansi 400'e de bolunmesi!
                if (yil % 400 == 0) {
                    System.out.println(yil + " bir artik yildir.");
                } else {
                    System.out.println(yil + " bir artik yil degildir.");
                }

            } else {
                // Yil 4'e bolunuyor ama 100'e bolunmuyor. Kural 2 geregi dogrudan artik yildir.
                System.out.println(yil + " bir artik yildir.");
            }

        } else {
            // Yil daha en bastan 4'e bile bolunemedi. Kural 1 geregi artik yil olamaz.
            System.out.println(yil + " bir artik yil degildir.");
        }
    }
}

