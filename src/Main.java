import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\PC\\Desktop\\prace szkolne\\binarne.txt";
        ArrayList<String> lista_binarna = Wczytaj_dane(filepath);
        for (String i : Zad1(lista_binarna)) {
            System.out.println(i);
        }
        for (String i : Zad2(lista_binarna)) {
            System.out.println(i);
        }
        for (String i : Zad3(lista_binarna)) {
            System.out.println(i);
        }
    }

    public static ArrayList<String> Zad1(ArrayList<String> lista_binarna) {
        ArrayList<String> Wynik = new ArrayList<String>();
        int najdluszy_dlugosc = 0;
        String najdluszy = "";
        int ilosc_dwucyklicznych = 0;
        String pierwszycykl;
        String drugicykl;
        for (String i : lista_binarna) {
            pierwszycykl = i.substring(0, i.length() / 2);
            drugicykl = i.substring(i.length() / 2);
            if (pierwszycykl.equals(drugicykl)) {
                ilosc_dwucyklicznych++;
                if (i.length() > najdluszy_dlugosc) {
                    najdluszy_dlugosc = i.length();
                    najdluszy = i;
                }


            }
        }
        Wynik.add("Zad1: Ilość slów dwucykliczncyh:");
        Wynik.add(Integer.toString(ilosc_dwucyklicznych));
        Wynik.add("Największa długość:");
        Wynik.add(Integer.toString(najdluszy_dlugosc));
        Wynik.add("Najdluższe słowo:");
        Wynik.add(najdluszy);
        return Wynik;
    }


    public static ArrayList<String> Zad2(ArrayList<String> lista_binarna) {
        ArrayList<String> Wynik1 = new ArrayList<String>();
        int ilosc_niepoprawnych = 0;
        String substringBCD;
        int najkrotsza_niepoprawna = Integer.MAX_VALUE;
        for (String i : lista_binarna) {
            for (int a = 0; a < i.length(); a += 4) {
                substringBCD = i.substring(a, a + 4);
                if (Integer.parseInt(substringBCD) > 1001) {
                    ilosc_niepoprawnych++;
                    if (najkrotsza_niepoprawna > i.length()) najkrotsza_niepoprawna = i.length();
                    break;
                }
            }
        }
        Wynik1.add("Zad2: Niepoprawne_napisy:");
        Wynik1.add(Integer.toString(ilosc_niepoprawnych));
        Wynik1.add("Dlugość najkrótszego:");
        Wynik1.add(Integer.toString(najkrotsza_niepoprawna));
        return Wynik1;
    }

    public static ArrayList<String> Zad3(ArrayList<String> lista_binarna) {
        ArrayList<String> Wynik2 = new ArrayList<String>();
       BigInteger najwieksza=new BigInteger(String.valueOf(0));
       String najwiekszabin="";

        for (String i : lista_binarna) {
           BigInteger liczbaBig=new BigInteger(i,2);
            if(BigInteger.valueOf(65535).compareTo(liczbaBig)==1 && liczbaBig.compareTo(najwieksza)==1){
                najwieksza=liczbaBig;
                najwiekszabin=i;
            }
        }
        Wynik2.add("Zad3: Największa binarna:");
        Wynik2.add(najwiekszabin);
        Wynik2.add("Największa decymalna:");
        Wynik2.add(najwieksza.toString(10));
        return Wynik2;
    }



    public static ArrayList<String> Wczytaj_dane (String filePath){
        ArrayList<String> lista_slow = new ArrayList<String>();
        try {


            FileReader fileReader = new FileReader(filePath);


            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;


            while ((line = bufferedReader.readLine()) != null) {
                lista_slow.add(line);
            }

            bufferedReader.close();
            return lista_slow;

        } catch (IOException e) {

            e.printStackTrace();
            return null;
        }
    }
}