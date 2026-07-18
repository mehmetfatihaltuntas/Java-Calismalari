package JavaGiris;

public class Ders03_EnvarterHesaplama {

    public static void main(String[] args) {

        /*
        Karakterinin çatışma sırasında loot yaptığı toplam 435 adet mermisi var.
        Karakterin kullandığı silahın şarjörü tam 30 mermi alıyor.

        Karakterin çantasına kaç adet tam dolu şarjör dizebileceğini bul ve yazdır

        Tam dolu şarjörler ayrıldıktan sonra çantada tekil olarak geriye kaç mermi kalacağını bul ve yazdır.
         */

        int toplamMermi = 435;
        int tamSarjorlukMermi = toplamMermi;
        int sarjorSayisi = 0;
        int sarjorKapasitesi = 30;

        int tekilMermi = tamSarjorlukMermi%sarjorKapasitesi;
        sarjorSayisi = tamSarjorlukMermi/sarjorKapasitesi;
        System.out.println(toplamMermi + " adet toplam mermiden karakter çantasına "+sarjorSayisi+" adet tamdolu sarjor dizebilir"+"\nTam dolu şarjörler ayrıldıktan sonra çantada "+tekilMermi+" adet mermi kalmıştır");
    }
}
