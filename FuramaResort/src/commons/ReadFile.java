package commons;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
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
    public static final String HOUSE_FILE = System.getProperty("user.dir") + "\\src\\data\\House.csv";
    public static final String ROOM_FILE = System.getProperty("user.dir") + "\\src\\data\\Room.csv";
    public static final String VILLA_FILE = System.getProperty("user.dir") + "\\src\\data\\Villa.csv";

    public static void showAllVilla() {
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
            List<Villa> villas = csvToBean.parse();
            for (Villa villa : villas) {
                System.out.println(villa.showInfo());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void showAllHouse() {
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
            List<House> houses = csvToBean.parse();
            for (House house : houses) {
                System.out.println(house.showInfo());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void showAllRoom() {
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
            List<Room> rooms = csvToBean.parse();
            for (Room room : rooms) {
                System.out.println(room.showInfo());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
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
                treeSet.add(dataDetails[1]);
            }
            for(String result : treeSet){
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
}
