package sda.csvreader.reader;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class CsvFileReader implements IFileReader {

    private static final String SEPARATOR = ";";
    private static final String CSV_FILE_SEPARATOR = ";";
    private String path;

    public CsvFileReader(String path) {
        this.path = path;
    }

    //MOJA METODA
    @Override
    public List<Map<String, String>> readFile(String path) throws IFileReaderException{

        List<Map<String, String>> dataList = new ArrayList<>();
        Map<String, String> baseMap;

        try {
            FileReader reader = new FileReader(path);
            BufferedReader bf = new BufferedReader(reader);

            String line = "";
            String[] headers;
            int lineCounter = 1;
            while ((line = bf.readLine()) != null) {
                if (lineCounter == 1) {
                    headers = line.split(SEPARATOR);
                    lineCounter++;
                } else {
                    String[] tokens = line.split(SEPARATOR);

                    baseMap = new LinkedHashMap<>();
                    baseMap.put("name", tokens[0]);
                    baseMap.put("prefix", tokens[1]);
                    baseMap.put("phoneNo", tokens[2]);

                    dataList.add(baseMap);
                }
            }

        } catch (java.io.IOException e) {
            throw new IFileReaderException(e.getMessage(), e.getCause());
        }


        return dataList;
    }

    //z zajec zapis tylko do mapy bez listy
    @Override
    public List<Map<String, String>> read(String path) throws IFileReaderException {
        List<Map<String, String>> result = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            //naglowki wiec pierwsza linie trzeba przetworzyc inaczej
            String[] headers = new String[10];
            int lineCounter = 1;
            while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
                if (lineCounter == 1) {
                    headers = line.split(CSV_FILE_SEPARATOR);
                    lineCounter++;
                } else {
                    String[] lineValues = line.split(CSV_FILE_SEPARATOR);
                    Map<String, String> row = new HashMap<>();
                    for(int i = 0; i<headers.length; i++){
                        row.put(headers[i], lineValues[i]);
                    }
                    result.add(row);
                }
            }
        } catch (java.io.IOException e) {
            throw new IFileReaderException(e.getMessage(), e.getCause());
        }
        return result;
    }

}
