package JavaGiris;

import java.util.Scanner;

public class Ders04_Slayt73_SwitchStatements {
    public static void main(String[] args) {

        // ==========================================
        // Switch Yapisi ile Secim Kontrolu
        // ==========================================

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Slayt 73: Switch Statements ile Gun Bulma ---");
        System.out.print("Lutfen haftanin gun numarasini giriniz (1-7): ");
        int gunNo = scanner.nextInt();
        switch (gunNo){
            case 1 :
                System.out.println("Pazartesi");
                break; // Eger break yazmazsak, kod durmaz ve alt satirdaki durumlari da calistirir!
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Çarşamba");
                break;
            case 4 :
                System.out.println("Perşembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                    System.out.println("Pazar");
                    break;
            default :
                // Yukaridaki case'lerden hicbiriyle eslesme saglanmazsa burasi calisir (if-else'deki else gibi).
                System.out.println("Gecersiz gun numarasi! Lutfen 1 ile 7 arasinda bir sayi giriniz.");



        }



    }
}
