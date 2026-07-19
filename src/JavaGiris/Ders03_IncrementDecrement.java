package JavaGiris;

public class Ders03_IncrementDecrement {

    public static void main(String[] args) {

        int can = 100;
        int mermi = 30;

        // ==========================================
        // 1. INCREMENT (ARTIRMA)
        // ==========================================
        // Karakterimiz saglik paketi aldi, cani 1 arttiriyoruz.
        can++;  // can artık 101
        System.out.println("Saglik paketi alindi! Yeni can : " + can);

        // ==========================================
        // 2. DECREMENT (AZALTMA)
        // ==========================================
        // Karakterimiz bir atis yapti, mermi 1 azaldi.
        mermi--;    // mermi artık 29;
        System.out.println("Ates edildi kalan mermi : " + mermi);

        // ==========================================
        // 3. PRE VE POST INCREMENT FARKI (Mülakat Sorusu)
        // ==========================================
        int a = 10;

        // Post-Increment once degeri yazdirir (10), sonra artirir
        System.out.println("Post-Increment(a++) : " + a++);
        System.out.println("Artırdıktan sonra a'nin degeri : " + a);    // a artik 11

        int b = 10;
        // Pre-Increment once degeri artirir (11), sonra yazdirir
        System.out.println("Pre-Increment (++b) : " + ++b);
        System.out.println("Artirdiktan sonra b'nin degeri : " + b);    // b artik 11


        // ==========================================
        // 3. PRE VE POST INCREMENT FARKI (Mülakat Sorusu)
        // ==========================================

        a = 10;
        System.out.println("a'nin degeri : " + ++a);    //a = 11
        b = a++;
        System.out.println("b'nin degeri : " + b);      //b = 11
        int c = b++ + a;                                // 11 + 12
        System.out.println("c'nin degeri : " + c);      //c = 23
        System.out.println("Son toplam : " + (a + b + c));  // 12 + 12 + 23 = 47


    }
}
