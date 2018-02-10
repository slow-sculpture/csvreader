package sda.csvreader.reader;

import java.util.List;
import java.util.Map;

public interface IFileReader {

    //MOJA METODA
    List<Map<String, String>> readFile(String path) throws IFileReaderException;

    //z zajec sama mapa ale jednak stwierdzil jak ja ze lepiej lista
    List<Map<String, String>> read(String path) throws IFileReaderException;
}
