package lt.vcd.Task1;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Įveskite stačiakampio kraštinės ilgį sveikąji skaičių: ");
        int x = in.nextInt();
        System.out.print("Įveskite stačiakampio kraštinės ilgį sveikąji skaičių: ");
        int y = in.nextInt();
        System.out.println("Stačiakmpio sveikųjų skaičių plotas: " + staciakampis(x, y));

        System.out.print("Įveskite stačiakampio kraštinės ilgį trupmeninį skaičių: ");
        double x1 = in.nextDouble();
        System.out.print("Įveskite stačiakampio kraštinės ilgį trupmeninį skaičių: ");
        double y1 = in.nextDouble();
        System.out.println("Stačiakmpio trupmeninių skaičių plotas: " + staciakampis(x1, y1));
    }

    public static int staciakampis(int x, int y) {
        int plotas = x*y;
        return plotas;
    }

    public static double staciakampis(double x, double y) {
        double plotas = x*y;
        return plotas;
    }


}
