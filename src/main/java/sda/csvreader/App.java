package sda.csvreader;

import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        String path = "C:\\Users\\chris\\IdeaProjects\\sda-csvreader\\dane.csv";

        //TODO: 1.  utworzyc szkielet klasy, ktoea otworzy plik
        CsvFileReader reader = new CsvFileReader(path);
        List<Map<String, String>> base = reader.readFile();  //zwraca liste map danych


        //TODO: 2. utworzyc klase/metode odpowiadajaca za przetworzenie pliku

        //TODO: 3. utworzyc metode, ktora wyciagnie z pierwszego wiersza pliku naglowki

        //TODO: 4. utworzyc merode, ktora przetworzy plik linia po linii oraz wrzuci rekordy z wiersza
        //TODO:    do mapy uzywajac naglowkow z poprzedniego kroku jako kluczy dla mapy
    }
}
