package commons;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import models.Services;
import models.Villa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ReadFile1 {
    private static final char SEPARATOR = ',';
    private static final char QUOTE = '"';
    private static final int NUM_OF_LINE_SKIP = 0;

    public static void readVillaFile() {
        String filePath = System.getProperty("user.dir") + "\\src\\data\\Villa.csv";

        try {
            ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
            strategy.setType(Villa.class);
            String[] columnMapping = new String[]{"id", "serviceName",
                    "usedArea", "rentCost", "maxQuantityOfPeople",
                    "renType", "roomStandard", "descriptionOtherAmenities", "poolArea", "floorNumber"};
            strategy.setColumnMapping(columnMapping);
            CsvToBean<Villa> csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(filePath))
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
}
