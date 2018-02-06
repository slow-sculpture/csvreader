package sda.csvreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvFileReader {

    private static final String SEPARATOR = ";";
    private String path;

    public CsvFileReader(String path) {
        this.path = path;
    }

    public List<Userdata> readFile() {

        Map<String, List<Userdata>> baseMap = new HashMap<>();
        List<Userdata> base = new ArrayList<>();

        try {
            FileReader reader = new FileReader(path);
            BufferedReader bf = new BufferedReader(reader);
            String line = "";
            while((line=bf.readLine())!=null){
                    String[] tokens = line.split(SEPARATOR);
                    Userdata userdata = new Userdata();
                    userdata.setName(tokens[0]);
                    userdata.setPrefix(Integer.parseInt(tokens[1]));
                    userdata.setPhoneNo(Integer.parseInt(tokens[2]));
                    base.add(userdata);

                    baseMap.put("name", base.get(0))
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        return base;
    }

}
