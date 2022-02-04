import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        int Bas= 10;
        float PerKm= 2.2F;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç KM gideceksiniz? ");
        int GidilenKm= input.nextInt();

        double Ucret=  GidilenKm*PerKm + 10;
        Ucret = (Ucret < 20) ? 20 : Ucret;
        System.out.println("Ödemeniz gereken ücret miktarı: " + Ucret + "TL");

    }

}
