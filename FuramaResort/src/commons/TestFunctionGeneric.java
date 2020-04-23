package commons;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import models.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TestFunctionGeneric implements DefineConstants {
    public static void main(String[] args) {
        List<Villa> listCustomers;
        listCustomers = getDataFromCsv(EntityType.VILLA);
        for(Villa customer : listCustomers){
            System.out.println(customer.showInfo());
        }
    }


    public static <E> ArrayList<E> getDataFromCsv(EntityType entityType) {
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
}
