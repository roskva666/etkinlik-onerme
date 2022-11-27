import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DEĞİŞKENLER
        double boy;
        double kilo;
        double indeks;

        //GİRDİLER
        Scanner input = new Scanner(System.in);

        System.out.println("BOYUNUZU GİRİNİZ: ");
        boy = input.nextDouble();

        System.out.println("KİLONUZU GİRİNİZ: ");
        kilo = input.nextDouble();

        //HESAPLAMALAR
        indeks = kilo / (boy * boy);

        System.out.println("VÜCUT KİTLE ENDEKSİNİZ: " + indeks);
    }
}