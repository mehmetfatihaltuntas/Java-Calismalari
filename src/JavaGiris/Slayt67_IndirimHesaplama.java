package JavaGiris;

import java.util.Scanner;

public class Slayt67_IndirimHesaplama {
    public static void main(String[] args) {
        /*
        Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        alirsa %15, yoksa %10 indirim yapin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürünün adedini giriniz");
        int urunAdedi = scanner.nextInt();
        System.out.println("Lütfen aldığınız ürünün liste  fiyatını giriniz");
        double listeFiyati = scanner.nextDouble();
        System.out.println("Müşteri kardınız yanınızda mı? (Evet veya Hayır yazın)");
        String musteriKardiKontrol = scanner.next();
        double yuzdeYirmiIndirimliOdeme = (urunAdedi*listeFiyati)-(urunAdedi*listeFiyati)*(0.2);
        double yuzdeOnbesIndirimliOdeme = (urunAdedi*listeFiyati)-(urunAdedi*listeFiyati)*(0.15);
        double yuzdeOnIndirimliOdeme = (urunAdedi*listeFiyati)-(urunAdedi*listeFiyati)*(0.1);



        if (musteriKardiKontrol.equalsIgnoreCase("evet")){
            if (urunAdedi>10){
                System.out.println("Yüzde 20 lik indirim kazandınız. Ödemeniz gereken fiyat : "+yuzdeYirmiIndirimliOdeme+" TL");
            }else
                System.out.println("Yüzde 15 lik indirim kazandınız. Ödemeniz gereken fiyat : "+yuzdeOnbesIndirimliOdeme+" TL");



        }else if (musteriKardiKontrol.equalsIgnoreCase("hayir")){
            if (urunAdedi>10){
                System.out.println("Yüzde 15 lik indirim kazandınız. Ödemeniz gereken fiyat : "+yuzdeOnbesIndirimliOdeme+" TL");
            }else
                System.out.println("Yüzde 10 lik indirim kazandınız. Ödemeniz gereken fiyat : "+yuzdeOnIndirimliOdeme+" TL");

        }else {
            System.out.println("Hatali giris yaptiniz. Lutfen kart durumu icin Evet veya Hayir giriniz.");
        }
    }
}
