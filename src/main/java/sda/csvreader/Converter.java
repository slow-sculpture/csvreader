package sda.csvreader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Converter {
    private String path; //////trzeba to ogarnac zeby globalnie byla dostepna

    public Map<String, String> convert(){
        Map<String, String> database = new HashMap<>();

        CsvFileReader reader = new CsvFileReader(path);
        List<Userdata> userdata = new ArrayList<>();

        database.put("name", userdata.get(0));
        database.put("prefix", );
        database.put("phoneNo", );

        return database;
    }
}
