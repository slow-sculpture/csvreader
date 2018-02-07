package sda.csvreader.reader;

import java.util.List;
import java.util.Map;

public interface IFileReader {
    List<Map<String, String>> readFile();
}
