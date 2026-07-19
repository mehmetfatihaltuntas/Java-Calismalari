package JavaGiris;

import java.util.Scanner;

public class Slayt62_IfStatementsPratik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // SORU 1: 5'in Tam Kati Kontrolu[cite: 1]
        // ==========================================

        System.out.println("--- Soru 1: 5'e Bolunebilme ---");
        System.out.println("Lütfen bir tamsayi giriniz?");
        int tamsayi = scanner.nextInt();

        // Eger sayinin 5'e bolumunden kalan 0 ise (Modulus islemi), sayi 5'in tam katidir.
        if (tamsayi%5==0){
            System.out.println("Girilen tamsayi 5'in tam katidir");
        }

        // ==========================================
        // SORU 4: Eskenar Ucgen Kontrolu[cite: 1]
        // ==========================================
        System.out.println("\n--- Soru 4: Eskenar Ucgen ---");
        System.out.println("Lutfen ucgenin kenar uzunluklarini sirayla girip enter'a basiniz:");
        System.out.print("1. Kenar: ");
        int kenar1 = scanner.nextInt();
        System.out.print("2. Kenar: ");
        int kenar2 = scanner.nextInt();
        System.out.print("3. Kenar: ");
        int kenar3 = scanner.nextInt();

        // Eskenar ucgen olmasi icin tum kenarlarin birbirine esit olmasi gerekir.
        if (kenar1==kenar2&&kenar2==kenar3){
            System.out.println("Eskenar Ucgendir");
        }



    }
}
