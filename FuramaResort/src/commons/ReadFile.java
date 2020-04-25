package commons;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import models.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadFile {
    private static final char SEPARATOR = ',';
    private static final char QUOTE = '"';
    private static final int NUM_OF_LINE_SKIP = 0;
    private static final String[] COLUMN_MAPPING_HOUSE = new String[]{"id", "serviceName",
            "usedArea", "rentCost", "maxQuantityOfPeople",
            "renType", "roomStandard", "descriptionOtherAmenities", "floorNumber"};
    private static final String[] COLUMN_MAPPING_ROOM = new String[]{"id", "serviceName",
            "usedArea", "rentCost", "maxQuantityOfPeople",
            "renType", "freeServiceIncluded"};
    private static final String[] COLUMN_MAPPING_VILLA = new String[]{"id", "serviceName",
            "usedArea", "rentCost", "maxQuantityOfPeople",
            "renType", "roomStandard", "descriptionOtherAmenities", "poolArea", "floorNumber"};
    private static final String[] COLUMN_MAPPING_CUSTOMER = new String[]{"customerName", "dayOfBirth",
            "gender", "idCard", "phoneNumber", "email", "customerType", "address"};
    private static final String[] COLUMN_MAPPING_EMPLOYEE = new String[]{"employeeName", "age",
            "address"};
    static final String HOUSE_FILE = System.getProperty("user.dir") + "\\src\\data\\House.csv";
    static final String ROOM_FILE = System.getProperty("user.dir") + "\\src\\data\\Room.csv";
    static final String VILLA_FILE = System.getProperty("user.dir") + "\\src\\data\\Villa.csv";
    static final String CUSTOMER_FILE = System.getProperty("user.dir") + "\\src\\data\\Customer.csv";
    static final String EMPLOYEE_FILENAME = System.getProperty("user.dir") + "\\src\\data\\Employee.csv";

    public static <E>ArrayList<E> getDataFromCsv(DefineConstants.EntityType entityType) {
        ArrayList<E> arrayLists = null;
        String filePath = "";
        String[] mapping;
        switch (entityType) {
            case VILLA:
                filePath = ReadFile.VILLA_FILE;
                mapping = ReadFile.COLUMN_MAPPING_VILLA;
                break;
            case HOUSE:
                filePath = ReadFile.HOUSE_FILE;
                mapping = ReadFile.COLUMN_MAPPING_HOUSE;
                break;
            case ROOM:
                filePath = ReadFile.ROOM_FILE;
                mapping = ReadFile.COLUMN_MAPPING_ROOM;
                break;
            case CUSTOMER:
                filePath = ReadFile.CUSTOMER_FILE;
                mapping = ReadFile.COLUMN_MAPPING_CUSTOMER;
                break;
            case EMPLOYEE:
                filePath = ReadFile.EMPLOYEE_FILENAME;
                mapping = ReadFile.COLUMN_MAPPING_EMPLOYEE;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + entityType);
        }
        try {
            ColumnPositionMappingStrategy<E> strategy = new ColumnPositionMappingStrategy<>();
            switch (entityType) {
                case VILLA:
                    strategy.setType((Class<? extends E>) Villa.class);
                    break;
                case HOUSE:
                    strategy.setType((Class<? extends E>) House.class);
                    break;
                case ROOM:
                    strategy.setType((Class<? extends E>) Room.class);
                    break;
                case CUSTOMER:
                    strategy.setType((Class<? extends E>) Customer.class);
                    break;
                case EMPLOYEE:
                    strategy.setType((Class<? extends E>) Employee.class);
                    break;
            }

            strategy.setColumnMapping(mapping);
            CsvToBean<E> csvToBean = new CsvToBeanBuilder<E>(new FileReader(filePath))
                    .withMappingStrategy(strategy)
                    .withSeparator(ReadFile.SEPARATOR)
                    .withQuoteChar(ReadFile.QUOTE)
                    .withSkipLines(ReadFile.NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            arrayLists = (ArrayList<E>) csvToBean.parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return arrayLists;
    }

    public static List<Employee> getAllEmployee() {
        List<Employee> employees = null;
        try {
            ColumnPositionMappingStrategy<Employee> strategy = new ColumnPositionMappingStrategy<>();
            strategy.setType(Employee.class);
            strategy.setColumnMapping(COLUMN_MAPPING_EMPLOYEE);
            CsvToBean<Employee> csvToBean = new CsvToBeanBuilder<Employee>(new FileReader(EMPLOYEE_FILENAME))
                    .withMappingStrategy(strategy)
                    .withSeparator(SEPARATOR)
                    .withQuoteChar(QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            employees = csvToBean.parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }


    public static List<String> getDataFromCsvFile(String fileName) {
        String filePath = System.getProperty("user.dir") + "\\src\\data\\" + fileName + ".csv";
        FileReader file;
        CSVReader csvReader = null;
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
}
