import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler
        int sicaklik;

        //Girdiler

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen hava sıcaklığını giriniz:");
        sicaklik = input.nextInt();

        if (sicaklik <= 5) {
            System.out.println("Kayak yapabilirsiniz");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (sicaklik >= 10 && sicaklik <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}