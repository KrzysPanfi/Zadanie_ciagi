import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
       String filepath="Z:binarne.txt";
       ArrayList<String> lista_binarna=Wczytaj_dane(filepath);
       for(String i:Zad1(lista_binarna)){
           System.out.println(i);
       }
        for(int i:Zad2(lista_binarna)){
            System.out.println(Integer.toString(i));
        }

    }
    private static ArrayList<String> Zad1(ArrayList<String>lista_binarna){
        ArrayList<String>Wynik=new ArrayList<String>();
        int najdluszy_dlugosc=0;
        String najdluszy="";
        int count=0;
        String pierwszycykl;
        String drugicykl;
        for(String i:lista_binarna){
            pierwszycykl=i.substring(0,i.length()/2);
            drugicykl=i.substring(i.length()/2);
           if(pierwszycykl.equals(drugicykl)){
               count++;
               if(i.length()>najdluszy_dlugosc){
                   najdluszy_dlugosc=i.length();
                   najdluszy=i;
               }


                    }
                }
        Wynik.add(Integer.toString(count));
        Wynik.add(Integer.toString(najdluszy_dlugosc));
        Wynik.add(najdluszy);
        return Wynik;
            }


private static ArrayList<Integer> Zad2(ArrayList<String> lista_binarna){
        ArrayList<Integer>Wynik=new ArrayList<Integer>();
        int count=0;
        int najkrotsza_niepoprawna=Integer.MAX_VALUE;
        for(String i:lista_binarna){
            String[]tablicabcd=i.split("(?<=\\G.{4})");
            for(String num:tablicabcd){
                if(Integer.parseInt(num)>1001){
                    count++;
                    if(najkrotsza_niepoprawna>i.length()){
                        najkrotsza_niepoprawna=num.length();
                    }
                }
            }
        }
        Wynik.add(count);
        Wynik.add(najkrotsza_niepoprawna);
        return Wynik;
}

    private static ArrayList<String> Wczytaj_dane(String filePath) {
        ArrayList<String> lista_slow=new ArrayList<String>();
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