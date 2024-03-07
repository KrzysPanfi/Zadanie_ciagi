import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
       String filepath="Downloads:binarne.txt";
       ArrayList<String> lista_binarna=Wczytaj_dane(filepath);


    }
    private static String Zad1(ArrayList<String>lista_binarna){
        ArrayList<String>Wynik=new ArrayList<String>()
        int najdluszy_dlugosc=0;
        String najdluszy="";
        int count=0;
        for(String i:lista_binarna){
            for(int j=0;j<i.length()/2;j++){
                if(i.charAt(j)==i.charAt(j+i.length()/2)){
                    count++;
                    if(i.length()>najdluszy_dlugosc){
                        najdluszy=i;
                        najdluszy_dlugosc=i.length();
                    }
                }
            }
        }return najdluszy;
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