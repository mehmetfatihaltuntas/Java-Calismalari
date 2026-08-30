package AhmetHocaDers.Ders_12_ForLoop.Do1_ForLoop;

public class C01_BasitDonguler {

    public static void main(String[] args) {
        // 1'den başlayıp 50'ye kadar (50 dahil) tek sayilari yazdirin
        for (int i = 1; i <=50 ; i+=2) {
            System.out.print(i+" ");

        }
        System.out.println();

        // 207'den başlayıp 5'er artirarak 400^den kucuk olan sayilari yazdirin
        for (int i = 207; i <400 ; i+=5) {
            System.out.print(i+" ");

        }
        System.out.println();

        // 2 basamakli, cift sayilarin toplai kactir?
        int toplam = 0;
        for (int i = 10; i <100 ; i+=2) {
            toplam = toplam+i;

        }
        System.out.println("iki basamkli cift sayilarin toplami = "+toplam+ " dir");

        // 40 sayisini kalansiz bolen pozitif tamsayilari yazdirin
        System.out.print("40 sayisini kalansiz bolen poz. tamsayilar = ");
        for (int i = 1; i <=40 ; i++) {
            if (40%i==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        System.out.print("1000'den geriye dogru 3 basamakli 37 ile bolunebilen sayilar = ");
        // 1000'den geriye dogru 3 basamakli 37 ile bolunebilen sayilari yazdirin
        for (int i = 1000; i >99 ; i--) {
            if (i%37==0){
                System.out.print(i + " ");
            }

        }
        System.out.println();

        // Verilen baslangic ve bitis degerleri dahil olmak uzere
        // bu sayilar arasinde 7 ile bolunebilen sayi adedini yadirin
        int baslangic = 235;
        int bitis = 1673;
        int adet = 0;
        for (int i = baslangic; i <=bitis ; i++) {
            if (i%7==0){
                adet++;
            }

        }
        System.out.println("Verilen  " + baslangic+ " ve  "+ bitis+ "  degerleri arasinde 7 ile bolunebilen sayi adedi = "+adet);




    }
}
