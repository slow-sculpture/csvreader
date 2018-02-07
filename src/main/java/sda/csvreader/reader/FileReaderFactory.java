package sda.csvreader.reader;

/**
 * szkielet
 * DO ZROBIENIA POZNIEJ
 */


public class FileReaderFactory {
    public static IFileReader createReader(String path) {
        if (path.endsWith(".csv")) {
            return new CsvFileReader(path);
        } else if (path.endsWith(".xml")) {
          //  return new XlsFileReader(path);
        } else if (path.endsWith("json")) {
         //   return new JsonEmployeeReader(path);
        }
        return null;
    }
}
