package commons;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeData(String fileName, String[] data) {
        String filePath = System.getProperty("user.dir") + "\\src\\data\\" + fileName + ".csv";
       // CSVWriter csvWriter;
        try {
            CSVWriter  csvWriter = new CSVWriter(new FileWriter(filePath, true));
            csvWriter.writeNext(data);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
