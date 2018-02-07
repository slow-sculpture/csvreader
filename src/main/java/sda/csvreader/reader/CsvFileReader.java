package sda.csvreader.reader;

import sda.csvreader.Userdata;
import sda.csvreader.reader.IFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvFileReader implements IFileReader{

    private static final String SEPARATOR = ";";
    private String path;

    public CsvFileReader(String path) {
        this.path = path;
    }

    public List<Map<String, String>> readFile() {

        List<Map<String, String>> dataList = new ArrayList<>();
        Map<String, String> baseMap;

//w pierwszej linii sa same Stringi - wypieprza sie bo przypisujemy inta
        try {
            FileReader reader = new FileReader(path);
            BufferedReader bf = new BufferedReader(reader);
            String line = "";
            while ((line = bf.readLine()) != null) {
                String[] tokens = line.split(SEPARATOR);
                Userdata userdata = new Userdata();
                userdata.setName(tokens[0]);
                userdata.setPrefix(tokens[1]);
                userdata.setPhoneNo(tokens[2]);

                baseMap = new HashMap<>();
                baseMap.put("name", userdata.getName());
                baseMap.put("prefix", userdata.getPrefix());
                baseMap.put("phoneNo", userdata.getPhoneNo());

                dataList.add(baseMap);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return dataList;
    }

}
