import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class Testzad1 {
    @Test
    public void testzad1() {
        ArrayList<String> lista_binarna = Main.Wczytaj_dane("C:\\Users\\PC\\Desktop\\prace szkolne\\binarne.txt");
        boolean wynik = true;
        float float1=00100101100011100010010110001110F;

            if (!(Main.Zad1(lista_binarna).get(1).equals(Integer.toString(18)))){
                wynik=false;
        }


        if(!(Main.Zad1(lista_binarna).get(3).equals(Integer.toString(32)))){
            wynik=false;
        }
if(!(Float.parseFloat(Main.Zad1(lista_binarna).get(5))==float1)){
 wynik=false;
}

        assertTrue( wynik);
    }
}
