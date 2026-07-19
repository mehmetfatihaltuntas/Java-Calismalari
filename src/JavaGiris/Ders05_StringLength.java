package JavaGiris;

import java.util.Scanner;

public class Ders05_StringLength {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Ders 05: String length() ile Sifre Kontrolu ---");
        System.out.println("Lutfen yeni sifrenizi belirleyin (En az 8 karakter): ");

        // Sifreyi kullanicidan aliyoruz. nextLine() kullanirsak bosluklari da kabul eder.
        String yeniSifre = scanner.nextLine();

        // ==========================================
        // length() Metodu ile Karakter Sayisini Bulma
        // ==========================================
        // sifre.length() metodu metnin kac karakterden olustugunu int olarak dondurur.
        int girilenKarakterSayisi = yeniSifre.length();

        // QA Test Senaryosu: Sifre 8 karakterden kisa mi degil mi?
        // Kac karakter eksik oldugunu matematiksel olarak bulup ekrana basiyoruz.
        int eksikKarakter = 8-girilenKarakterSayisi;
        if (girilenKarakterSayisi<8){
            System.out.println("Girdiginiz karakter sayisi 8'den azdir " + eksikKarakter + " karakter daha girmeniz gerekmektedir");
        }else
            System.out.println("Sifreniz olusturulmustur. Yeni sifreniz : "+yeniSifre);

        }



    }

