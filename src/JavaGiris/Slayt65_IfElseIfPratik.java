package JavaGiris;

import java.util.Scanner;

public class Slayt65_IfElseIfPratik {
    public static void main(String[] args) {

        // Kullanicidan girdi almak icin Scanner nesnemizi olusturuyoruz
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Slayt 65: Harf Notu Hesaplama ---");
        System.out.print("Lutfen donem sonu notunuzu giriniz (Orn: 78,5): ");
        double not = scanner.nextDouble();

        // Secenek sayisi 2'den fazla oldugu icin if - else if yapisi kurguluyoruz.
        // Java yukaridan asagiya okur, ilk true olan sarti buldugunda iceri girer ve digerlerini atlar.

        if (not>=85){
            System.out.println("Tebrikler notunuz :  AA");
        } else
            if (not>=65) {
                System.out.println("Tebrikler notunuz :  BB");
            } else
                if (not>=50) {
                    System.out.println("Tebrikler notunuz :  CC");
            }else System.out.println("Maalesef kaldiniz notunuz : DD");


    }
}
