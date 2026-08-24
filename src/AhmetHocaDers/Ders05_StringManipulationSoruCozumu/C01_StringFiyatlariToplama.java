package AhmetHocaDers.Ders05_StringManipulationSoruCozumu;

public class C01_StringFiyatlariToplama
{
    public static void main(String[] args) {

        // Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        //		input1= “$15.30” , input2 = "$11.45"
        //		output = “$26.75”
        //		NOT : Sondaki para birimi değişken olmalıdır.

        String input1 = "15.30 $";
        String input2 = "11.45 $";
        System.out.println(input1 + input2);  // $15.30$11.45

        // Önce Dolar işaretinin indexini bulalım
        int dolarSimgeIndexiInput1 = input1.indexOf(" "); //5
        int dolarSimgeIndexiInput2 = input2.indexOf(" "); //5
        String paraBirimi = input1.substring(dolarSimgeIndexiInput1);


       input1 = input1.replaceAll("\\D","");
       input2 = input2.replaceAll("\\D","");

        double fiyat1 = Double.parseDouble(input1)/100;
        double fiyat2 = Double.parseDouble(input2)/100;
        System.out.println("Fiyatların toplamı : "+(fiyat1 + fiyat2)+paraBirimi);


    }
}
