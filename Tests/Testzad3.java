import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Testzad3 {

    @Test
    public void zad3() {
        ArrayList<String> lista_binarna = Main.Wczytaj_dane("C:\\Users\\PC\\Desktop\\prace szkolne\\binarne.txt");
        boolean wynik = true;


        if (!(Float.parseFloat(Main.Zad3(lista_binarna).get(1)) == 1101011001100101F)) {
            wynik = false;
        }

        if (!(Integer.parseInt(Main.Zad3(lista_binarna).get(3)) == 54885)) {
            wynik = false;
        }


        assertTrue(wynik);
    }
}
