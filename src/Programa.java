import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        int w = skaitytuvas.nextInt();          // arbūzo svoris
        System.out.println("w = " + w);

    }


    /**
     * Funkcija patikrina ar skaičius yra lyginis
     * @param x tikrinamas skaičius
     * @return grąžina true, jei lyginis; grąžina false, jei nelyginis.
     */
    public boolean arSkaiciusLyginis(int x) {
        return x % 2 == 0;
    }


    /**
     * Funkcija konvertuoja boolean reikšmę į paprastas angliškas žodines reikšmes (yes ir no)
     * @param b boolean reikšmė
     * @return Yes jeigu true, No jeigu false
     */
    public String konvertuojaYesIrNo(boolean b) {
        if (b) {
            return "Yes";
        }
        else {
            return "No";
        }
    }
}
