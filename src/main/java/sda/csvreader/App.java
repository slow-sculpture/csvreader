package sda.csvreader;

import sda.csvreader.reader.CsvFileReader;

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
        List<Map<String, String>> dataBase = reader.readFile();  //zwraca liste map danych
        System.out.println(dataBase.get(0));
        System.out.println(dataBase.get(1));
        System.out.println(dataBase.get(2));
        System.out.println(dataBase.get(3));


        //TODO: 2. utworzyc klase/metode odpowiadajaca za przetworzenie pliku

        //TODO: 3. utworzyc metode, ktora wyciagnie z pierwszego wiersza pliku naglowki

        //TODO: 4. utworzyc merode, ktora przetworzy plik linia po linii oraz wrzuci rekordy z wiersza
        //TODO:    do mapy uzywajac naglowkow z poprzedniego kroku jako kluczy dla mapy
    }
}
