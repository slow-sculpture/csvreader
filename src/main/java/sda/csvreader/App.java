package sda.csvreader;

import sda.csvreader.reader.CsvFileReader;
import sda.csvreader.reader.IFileReader;
import sda.csvreader.reader.IFileReaderException;


import java.util.List;
import java.util.Map;


public class App 
{
    public static void main( String[] args ){
        String path = "C:\\Users\\chris\\IdeaProjects\\sda-csvreader\\dane.csv";

        //TODO: 1.  utworzyc szkielet klasy, ktoea otworzy plik
        IFileReader reader = new CsvFileReader(path);

     /*   List<Map<String, String>> dataBase = reader.readFile(path);  //zwraca liste map danych

        //test
        System.out.println(dataBase.get(0));
        System.out.println(dataBase.get(1));
        System.out.println(dataBase.get(2));
        System.out.println(dataBase.get(3));*/


        //z zajec
        try {
            List<Map<String, String>> fileContents = reader.read(path);
            System.out.println("Amount of row in the file: "+fileContents.size());
        } catch (IFileReaderException e) {
            e.printStackTrace();
        }


        //TODO: 2. utworzyc klase/metode odpowiadajaca za przetworzenie pliku


        //TODO: 3. utworzyc metode, ktora wyciagnie z pierwszego wiersza pliku naglowki

        //TODO: 4. utworzyc merode, ktora przetworzy plik linia po linii oraz wrzuci rekordy z wiersza
        //TODO:    do mapy uzywajac naglowkow z poprzedniego kroku jako kluczy dla mapy
    }
}
