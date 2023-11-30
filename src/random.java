import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner drukarka = new Scanner(System.in);
     /*   System.out.println("Podaj liczbę wyświetlanych liczb:  ");
        int liczba = drukarka.nextInt();
        System.out.println("Podaj minimalny zakres: ");
        int min = drukarka.nextInt();
        System.out.println("Podaj maksymalny zakres: ");
        int max = drukarka.nextInt();
        if(min >= max) {
            System.out.println("Nieprawidłowe dane");
        }
        else {
        double[] tablica = new double[liczba];
        System.out.println("Oto wylosowane liczby: ");
        for(int i = 0; i < tablica.length; i++) {
            if (i % 10 == 0) System.out.println();
            tablica[i] = Math.round(Math.random() * (max - min) * 100 ) / 100 + min;

            System.out.print(tablica[i] + ",");
        }


        }
        */

        System.out.println();
        System.out.println("Podaj dwie liczby: ");
        BigDecimal liczbaA = drukarka.nextBigDecimal();
        BigDecimal liczbaB = drukarka.nextBigDecimal();
        if(liczbaA.compareTo(liczbaB) == -1) {
            System.out.println("LiczbaA jest mniejsza od liczby b ");
        }
        else if(liczbaA.compareTo(liczbaB) == 0) {
            System.out.println("Obie liczby są takie same");
        }
        else {
            System.out.println("LiczbaA jest większa od liczby b ");
        }

    }
}
