package AhmetHocaDers.Ders05_StringManipulationSoruCozumu;

import java.util.Scanner;

public class C05_IsmiDuzenleme {

    // Kullanıcıdan ismini alın
    // Kullanıcı 3 isimli olsa da
    // isimlerin ilk harfi büyük harf, kalanlar * olacak şekilde yazdırın
    // örnek input   :   ali mert can
    //       output  :   A** M** C**

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scanner.nextLine();

        int ilkSpaceIndex = isim.indexOf(" ");
        int ikinSpaceIndex = isim.indexOf(" ", ilkSpaceIndex+1);
        
        // Önce kelime sayısını bulalım
        int kelimeSayisi = 0;
        
        if (ilkSpaceIndex==-1){
            kelimeSayisi =1;
        } else if (ikinSpaceIndex==-1) {
            kelimeSayisi =2;
        }else {
            kelimeSayisi =3;
        }

        switch (kelimeSayisi) {
            case 1: // tek kelimeli isim

                System.out.println(
                        isim.substring(0, 1).toUpperCase() +
                                isim.substring(1).replaceAll("\\w", "*")

                );


                break;

            case 2:  // İki kelimeli isim    mehmet ali

                System.out.println(
                        isim.substring(0, 1).toUpperCase() +
                                isim.substring(1, ilkSpaceIndex).replaceAll("\\w", "*")
                                + " " + isim.substring(ilkSpaceIndex+1, ilkSpaceIndex + 2).toUpperCase() + isim.substring(ilkSpaceIndex + 2)
                                .replaceAll("\\w", "*")

                );

                break;

            case 3:
                System.out.println(
                        isim.substring(0, 1).toUpperCase() +
                                isim.substring(1, ilkSpaceIndex).replaceAll("\\w", "*") + " "
                                + isim.substring(ilkSpaceIndex+1, ilkSpaceIndex + 2).toUpperCase() + isim.substring(ilkSpaceIndex + 2,ikinSpaceIndex)
                                .replaceAll("\\w", "*") + " " + isim.substring(ikinSpaceIndex + 1, ikinSpaceIndex + 2).toUpperCase() +
                                isim.substring(ikinSpaceIndex + 2).replaceAll("\\w", "*")
                );



        }





    }
}
