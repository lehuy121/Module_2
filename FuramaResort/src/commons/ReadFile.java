package commons;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import models.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadFile {
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
    public static final String SORT_BY_CUSTOMER_NAME = "----------Sort by customer name----------";

    public static List<Villa> getAllVilla() {
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

    public static List<House> getAllHouse() {
        List<House> houses = null;
        try {
            ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
            strategy.setType(House.class);
            strategy.setColumnMapping(COLUMN_MAPPING_HOUSE);
            CsvToBean<House> csvToBean = new CsvToBeanBuilder<House>(new FileReader(HOUSE_FILE))
                    .withMappingStrategy(strategy)
                    .withSeparator(SEPARATOR)
                    .withQuoteChar(QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            houses = csvToBean.parse();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return houses;
    }

    public static List<Room> getAllRoom() {
        List<Room> rooms=null;
        try {
            ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
            strategy.setType(Room.class);
            strategy.setColumnMapping(COLUMN_MAPPING_ROOM);
            CsvToBean<Room> csvToBean = new CsvToBeanBuilder<Room>(new FileReader(ROOM_FILE))
                    .withMappingStrategy(strategy)
                    .withSeparator(SEPARATOR)
                    .withQuoteChar(QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
           rooms = csvToBean.parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return rooms;
    }

    public static void showServiceNameNotDuplicate(String fileName) {
        String filePath = System.getProperty("user.dir") + "\\src\\data\\" + fileName + ".csv";
        FileReader file;
        CSVReader csvReader = null;
        try {
            file = new FileReader(filePath);
            csvReader = new CSVReader(file);
            String[] dataDetails;
            TreeSet<String> treeSet = new TreeSet<>();
            while ((dataDetails = csvReader.readNext()) != null) {
                treeSet.add(dataDetails[COLUMN_SERVICE_NAME]);
            }
            for (String result : treeSet) {
                System.out.println(result);
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

    public static void showAndSortInformationCustomerByName() {
        try {
            ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
            strategy.setType(Customer.class);
            strategy.setColumnMapping(COLUMN_MAPPING_CUSTOMER);
            CsvToBean<Customer> csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(CUSTOMER_FILE))
                    .withMappingStrategy(strategy)
                    .withSeparator(SEPARATOR)
                    .withQuoteChar(QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            List<Customer> customers = csvToBean.parse();
            Collections.sort(customers, new CustomerNameComparator());
            System.out.println(SORT_BY_CUSTOMER_NAME);
            for (Customer customer : customers) {
                System.out.println(customer.showInfo());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void getInformationCustomer() {
        try {
            ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
            strategy.setType(Customer.class);
            strategy.setColumnMapping(COLUMN_MAPPING_CUSTOMER);
            CsvToBean<Customer> csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(CUSTOMER_FILE))
                    .withMappingStrategy(strategy)
                    .withSeparator(SEPARATOR)
                    .withQuoteChar(QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            List<Customer> customers = csvToBean.parse();
            for (Customer customer : customers) {
                System.out.println(customer.showInfo());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static class CustomerNameComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.getCustomerName().compareTo(o2.getCustomerName());
        }
    }

}
