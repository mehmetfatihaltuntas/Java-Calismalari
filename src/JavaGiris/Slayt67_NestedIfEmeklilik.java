package JavaGiris;

import java.util.Scanner;

public class Slayt67_NestedIfEmeklilik {
    public static void main(String[] args) {
        /*
         Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
         yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
         olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scanner.nextInt();
        System.out.print("Lütfen cinsiyetinizi giriniz  Erkek = e/E , Kadin = k/K   :  ");
        String cinsiyet = scanner.next();

        if (cinsiyet.equalsIgnoreCase("E")){
            if (yas<65){
                System.out.println("Emekli olmaniz icin gereken sure : " + (65-yas)+" yil");
            }else System.out.println("Tebrikler emekli olabilirsiniz");
        }else if (cinsiyet.equalsIgnoreCase("K")){
            if (yas<60){
                System.out.println("Emekli olmaniz icin gereken sure : " + (60-yas)+" yil");
            }else System.out.println("Tebrikler emekli olabilirsiniz");

        }else {
            System.out.println("Gecersiz cinsiyet bilgisi girdiniz!");
        }

    }
}
