package AhmetHocaDers.Ders_12_ForLoop.Do1_ForLoop;

import java.util.Scanner;

public class C03_AradakiSayilarinToplami {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degernden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Baslangic degeri olarak pozitif tamsayi giriniz...");
        int baslangic = scanner.nextInt();
        System.out.println("Bitis degeri olarak pozitif tamsayi giriniz...");
        int bitis = scanner.nextInt();

        if (bitis<baslangic){
            System.out.println("Bitis degeri baslangic degerinden kucuk olamaz");
        }
        if (bitis>baslangic){
            int toplam =0;
            for (int i = baslangic; i <=bitis ; i++) {
                toplam=toplam+i;
            }
            System.out.println(baslangic+" ve "+ bitis+ " pozitif tam sayilarin toplami : "+toplam);
        }
    }
}
