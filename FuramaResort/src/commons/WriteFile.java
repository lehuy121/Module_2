package commons;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static void writeData(String fileName, String[] data) {
        String filePath = System.getProperty("user.dir") + "\\src\\data\\" + fileName + ".csv";
        CSVWriter csvWriter = null;
        try {
            //Create CSVWriter for writing to Employee.csv
            csvWriter = new CSVWriter(new FileWriter(filePath, true));
            csvWriter.writeNext(data);
        } catch (Exception ee) {
            ee.printStackTrace();
        } finally {
            try {
                //closing the writer
                assert csvWriter != null;
                csvWriter.close();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
    }
}
