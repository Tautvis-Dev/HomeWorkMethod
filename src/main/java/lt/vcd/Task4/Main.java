package lt.vcd.Task4;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static long katalogoFailai(String katalogas) {
        File fil = new File(katalogas);
        if (fil.isDirectory()) {
            System.out.println("Katalogas egzistuoja");
        } else {
            System.out.println("Katalogo nėra");
            return 0;
        }
        String[] f = fil.list();
        long bendrasFailuDydis = 0;
        for (int i = 0; i <f.length; i++) {
            File catalog=new File(katalogas, f[i]);
            if (catalog.isDirectory()) {
                long failuDydis = katalogoFailai(catalog.getPath()+"/");
                bendrasFailuDydis += failuDydis;
                System.out.print(failuDydis+" bytes ");
            } else {
                bendrasFailuDydis += catalog.length();
                System.out.print(catalog.length()+ " bytes ");
            }
            System.out.println(catalog.getPath());
        }
        return bendrasFailuDydis;
    }
    
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite failo kelia: ");
        String ivedimas = in.nextLine();

      long bytes = katalogoFailai(ivedimas);
        System.out.println(bytes + " bytes");
        float kb = (float)bytes / 1000;
        System.out.println(kb + "KB");
        float mb = kb / 1000;
        System.out.println(mb + "MB");
    }
}
