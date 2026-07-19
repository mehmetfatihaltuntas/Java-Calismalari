package JavaGiris;

public class Slayt52_IncrementPratik {
    public static void main(String[] args) {

        System.out.println("--- Slayt 52: Pre-Post Increment Testi ---");

        // 1. Adim: Baslangic degeri
        int a = 10;

        // 2. Adim: Pre-Increment (Once artir, sonra yazdir)
        System.out.println("a'nin degeri : " + ++a); // Konsol: 11 (a hafizada 11)

        // 3. Adim: Post-Increment (Once b'ye ata, sonra a'yi artir)
        int b = a++; // b = 11 olur, a hafizada 12 olur[cite: 1].
        System.out.println("b'nin degeri : " + b); // Konsol: 11

        // 4. Adim: Karma Karma Islem[cite: 1]
        // b++ degeri once isleme girer (11 olarak), islem bittikten sonra b hafizada 12 olur.
        // a'nin guncel degeri olan 12 ile toplanir: 11 + 12 = 23.
        int c = b++ + a;
        System.out.println("c'nin degeri : " + c); // Konsol: 23

        // 5. Adim: Son Hafiza Durumu Ile Toplam
        // a = 12, b = 12, c = 23 -> Toplam = 47
        System.out.println("Son toplam : " + (a + b + c));

    }
}
