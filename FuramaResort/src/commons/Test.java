package commons;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import models.Services;
import models.Villa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    private static final char SEPARATOR = ',';
    private static final char QUOTE = '"';
    private static final int NUM_OF_LINE_SKIP = 0;
    public static final String[] COLUMN_MAPPING_HOUSE = new String[]{"id", "serviceName",
            "usedArea", "rentCost", "maxQuantityOfPeople",
            "renType", "roomStandard", "descriptionOtherAmenities", "floorNumber"};
    public static final String[] COLUMN_MAPPING_ROOM = new String[]{"id", "serviceName",
            "usedArea", "rentCost", "maxQuantityOfPeople",
            "renType", "freeServiceIncluded"};
    public static final String[] COLUMN_MAPPING_VILLA = new String[]{"id", "serviceName",
            "usedArea", "rentCost", "maxQuantityOfPeople",
            "renType", "roomStandard", "descriptionOtherAmenities", "poolArea", "floorNumber"};
    public static final String[] COLUMN_MAPPING_CUSTOMER = new String[]{"customerName", "dayOfBirth",
            "gender", "idCard", "phoneNumber", "email", "customerType", "address"};
    public static final String HOUSE_FILE = System.getProperty("user.dir") + "\\src\\data\\House.csv";
    public static final String ROOM_FILE = System.getProperty("user.dir") + "\\src\\data\\Room.csv";
    public static final String VILLA_FILE = System.getProperty("user.dir") + "\\src\\data\\Villa.csv";
    public static final String CUSTOMER_FILE = System.getProperty("user.dir") + "\\src\\data\\Customer.csv";
    public static final int COLUMN_SERVICE_NAME = 1;
    public static void main(String[] args) {
        int customerNumber = 0;
        int serviceNumber = 0;
        List<String> listCustomer = Test.readFileCsv("Customer");
        String customer = listCustomer.get(customerNumber);

        List<String> listService = Test.readFileCsv("Villa");
//        service = listService.get(serviceNumber);
//
//        useService = ReadFile.getAllVilla().get(serviceNumber);
//
//        String[] booking = new String[]{customer, service};
//        WriteFile.writeData("Booking", booking);



//            System.out.println(showAllVilla().get(0).getServiceName());
//            System.out.println(showAllVilla().get(0).getDescriptionOtherAmenities());
//            System.out.println(showAllVilla().get(0).getMaxQuantityOfPeople());
//            System.out.println(showAllVilla().get(0).getRentCost());



    }
    //public List<String>

    public static List<String> readFileCsv(String fileName) {
        String filePath = System.getProperty("user.dir") + "\\src\\data\\" + fileName + ".csv";
        FileReader file;
        CSVReader csvReader = null;
//        int index = 1;
//        if(fileName.equals("Customer")){
//            index = 0;
//        }

        List<String> results = new ArrayList<>();
        try {
            file = new FileReader(filePath);
            csvReader = new CSVReader(file);
            String[] dataDetails;
            while ((dataDetails = csvReader.readNext()) != null) {
                results.add(Arrays.toString(dataDetails));
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
        return results;
    }

    public static List<Villa> showAllVilla() {
        List<Villa> villas=null;
        try {
            ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
            strategy.setType(Villa.class);
            strategy.setColumnMapping(COLUMN_MAPPING_VILLA);
            CsvToBean<Villa> csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(VILLA_FILE))
                    .withMappingStrategy(strategy)
                    .withSeparator(SEPARATOR)
                    .withQuoteChar(QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            villas = csvToBean.parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return villas;
    }
}
