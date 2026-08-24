package AhmetHocaDers.Ders05_StringManipulationSoruCozumu;

import java.util.Scanner;

public class C04_MetinDegistirme {
    // Kullanıcıdan bir String alın
    // Stringin uzunluğu bir çift sayı ise tam ortasına :) ekleyin
    // Stringin uzunluğu tek sayı ise ortadaki harfi silin ve yerine :( yazdırın

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scanner.nextLine();


        if (metin.length()%2==0){
            System.out.println(
                    metin.substring(0,metin.length()/2)+":)"+metin.substring(metin.length()/2)
            );
        } else   {
            System.out.println(
                   //metin.replace(metin.substring(metin.length()/2,metin.length()/2+1),":(")
                    metin.substring(0,metin.length()/2)+":("+metin.substring(metin.length()/2+1)
            );

        }
    }
}
