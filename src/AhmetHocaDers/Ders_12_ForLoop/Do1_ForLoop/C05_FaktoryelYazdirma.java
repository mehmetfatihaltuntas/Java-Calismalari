package AhmetHocaDers.Ders_12_ForLoop.Do1_ForLoop;

import java.util.Scanner;

public class C05_FaktoryelYazdirma {
    public static void main(String[] args) {

        // Kullanicidan 18'den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilmasinida yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoryel hesaplamak icin pozitif tamsayi giriniz...");
        int sayi = scanner.nextInt();
        int faktoryel = 1;
        System.out.print(sayi+"! = ");
        for (int i = sayi; i >1 ; i--) {
            System.out.print(i+"*");

        }
        for (int i = 1; i <=sayi ; i++) {
            faktoryel=faktoryel*i;

        }
        System.out.print("1  = "+faktoryel);

    }
}
