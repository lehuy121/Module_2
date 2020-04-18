package controllers;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class mapCsvToClassObj {

    public static class ParseCsvToBean {
        // the delimiter to use for separating entries
        private static final char DEFAULT_SEPARATOR = ',';

        // the character to use for quoted elements
        private static final char DEFAULT_QUOTE = '"';

        // the line number to skip for start reading
        private static final int NUM_OF_LINE_SKIP = 0;

        public static void main(String[] args) throws FileNotFoundException {
            String csvFile = "H:\\Module_2\\FuramaResort\\src\\data.csv";
            parseCSVtoBean(csvFile);
        }

        public static void parseCSVtoBean(String filename) throws FileNotFoundException {
            ColumnPositionMappingStrategy<Country> strategy = new ColumnPositionMappingStrategy<>();
            strategy.setType(Country.class);
            String[] columns = new String[]{"id", "code", "nameT"}; //tham so
            strategy.setColumnMapping(columns);

            CsvToBean<Country> csvToBean = new CsvToBeanBuilder<Country>(new FileReader(filename))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            List<Country> countries = csvToBean.parse();
            for (Country country : countries) {
                System.out.println(country);
            }
        }
    }
}
