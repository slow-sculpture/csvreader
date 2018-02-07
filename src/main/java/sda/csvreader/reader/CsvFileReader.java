package sda.csvreader.reader;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class CsvFileReader implements IFileReader{

    private static final String SEPARATOR = ";";
    private String path;

    public CsvFileReader(String path) {
        this.path = path;
    }

    public List<Map<String, String>> readFile() {

        List<Map<String, String>> dataList = new ArrayList<>();
        Map<String, String> baseMap;

        try {
            FileReader reader = new FileReader(path);
            BufferedReader bf = new BufferedReader(reader);
            String line = "";
            while ((line = bf.readLine()) != null) {
                String[] tokens = line.split(SEPARATOR);

                baseMap = new LinkedHashMap<>();
                baseMap.put("name", tokens[0]);
                baseMap.put("prefix", tokens[1]);
                baseMap.put("phoneNo", tokens[2]);

                dataList.add(baseMap);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return dataList;
    }

}
