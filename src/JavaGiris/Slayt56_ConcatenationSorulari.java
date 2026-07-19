package JavaGiris;

public class Slayt56_ConcatenationSorulari {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = " ";
        String s3 = "kolay";
        String s4 = "";
        int a = 3;
        int b = 4;

        // "12 Java kolay"
        // Carpma (*) isleminin onceligi oldugu icin once (a * b) yapilir (12), sonra metinler eklenir
        System.out.println((a*b)+s2+s1+s2+s3);          // 12 Java kolay

        // "7 Java kolay"
        // Soldan saga ilerlerken once (a + b) toplanir (7), sonra String ifadelerle birlesir.
        System.out.println((a+b)+s2+s1+s2+s3);          // 7 Java kolay

        // "34Java kolay"
        // Baslangicta s4 (hiclik) oldugu icin a (3) ve b (4) degerleri sayisal olarak toplanamaz, yan yana eklenir
        System.out.println(a+s4+b+s1+s2+s3);            // 34Java kolay

        // "Java12kolay"
        // s1 metninden sonra gelen (a * b) carpim onceliginden dolayi 12 olur ve metne eklenir
        System.out.println(s1+(a*b)+s3);                // Java12kolay

        // "Java34kolay"
        // s1 metninden basladigi icin Java sonra gelen a ve b'yi matematiksel toplamaz, metin gibi yan yana yazar
        System.out.println(s1+a+b+s3);                  // Java34kolay

        // "Java7kolay"
        // Parantez icinin onceligi oldugu icin once (a + b) toplanir (7), sonra s1 ve s3 ile birlesir
        System.out.println(s1 + (a + b) + s3);          // Java7kolay


    }
}
