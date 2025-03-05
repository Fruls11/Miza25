import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ustvarimo seznam za shranjevanje vseh objektov
        ArrayList<Zmogljivost> seznamObjektov = new ArrayList<>();
        
        // Branje podatkov za torbo
        System.out.print("Vnesite nosilnost torbe (kg): ");
        double nosilnost = scanner.nextDouble();
        Torba torba = new Torba(nosilnost);
        
        // Dodamo torbo v seznam
        seznamObjektov.add(torba);

        // Branje podatkov za steklenico
        System.out.print("Vnesite kapaciteto steklenice (ml): ");
        int kapaciteta = scanner.nextInt();
        scanner.nextLine(); // Počisti newline
        System.out.print("Vnesite vsebino steklenice: ");
        String vsebina = scanner.nextLine();
        Steklenica steklenica = new Steklenica(kapaciteta, vsebina);
        
        // Dodamo steklenico v seznam
        seznamObjektov.add(steklenica);

        // Izpis zmogljivosti vseh objektov
        for (Zmogljivost objekt : seznamObjektov) {
            objekt.preveriZmogljivost();
        }

        scanner.close();
    }
}