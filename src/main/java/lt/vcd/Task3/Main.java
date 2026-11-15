package lt.vcd.Task3;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Iveskite skaičių: ");
        int sk = in.nextInt();
        System.out.print(skaitmenuSuma(sk));

    }

    public static int skaitmenuSuma(int sk) {
        if (sk / 10 == 0) {
           return sk;
        } else {
                return (sk % 10) + skaitmenuSuma(sk / 10);
        }





    }


}
