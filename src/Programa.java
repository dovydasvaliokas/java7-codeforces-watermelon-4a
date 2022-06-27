import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        short w = skaitytuvas.nextShort();          // arbūzo svoris

        System.out.println(konvertuojaYesIrNo(arSkaiciusLyginisIrNeDvejetas(w)));

    }

    /**
     * Funkcija patikrina ar skaičius yra lyginis
     * @param x tikrinamas skaičius
     * @return grąžina true, jei lyginis; grąžina false, jei nelyginis.
     */
    public static boolean arSkaiciusLyginisIrNeDvejetas(int x) {
        return x % 2 == 0 && x > 2;
    }


    /**
     * Funkcija konvertuoja boolean reikšmę į paprastas angliškas žodines reikšmes (yes ir no)
     * @param b boolean reikšmė
     * @return Yes jeigu true, No jeigu false
     */
    public static String konvertuojaYesIrNo(boolean b) {
        if (b) {
            return "Yes";
        }
        else {
            return "No";
        }
    }
}
