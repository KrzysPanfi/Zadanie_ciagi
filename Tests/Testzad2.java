import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Testzad2 {

    @Test
    public void zad2() {
        ArrayList<String> lista_binarna = Main.Wczytaj_dane("C:\\Users\\PC\\Desktop\\prace szkolne\\binarne.txt");
        boolean wynik = true;


        if (!(Main.Zad2(lista_binarna).get(1).equals(Integer.toString(359)))) {
            wynik = false;
        }


        if (!(Main.Zad2(lista_binarna).get(3).equals(Integer.toString(4)))) {
            wynik = false;
        }


        assertTrue(wynik);
    }
}