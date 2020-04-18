package commons;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadFile {
    public static void main(String[] args) {
        readData("Villa");
    }
    public static void readData(String fileName) {
        String filePath = System.getProperty("user.dir") + "\\src\\data\\" + fileName + ".csv";
        FileReader file;
        CSVReader csvReader = null;
        try {
            file = new FileReader(filePath);
            csvReader = new CSVReader(file);
            String[] dataDetails;
            while ((dataDetails = csvReader.readNext()) != null) {
               // System.out.println(Arrays.toString(dataDetails));
                System.out.println(Arrays.toString(dataDetails));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assert csvReader != null;
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
