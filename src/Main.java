import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;

        System.out.print("Armut Kaç Kilo? : ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlıcanKilo = scanner.nextDouble();

        double toplamTutar = (armutFiyati * armutKilo) + (elmaFiyati * elmaKilo) + (domatesFiyati * domatesKilo) + (muzFiyati * muzKilo) + (patlicanFiyati * patlıcanKilo);

        System.out.println("Toplam Tutar : " + toplamTutar + " TL ");


    }
}