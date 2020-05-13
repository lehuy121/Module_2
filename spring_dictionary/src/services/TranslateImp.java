package services;

import model.Dictionary;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
public class TranslateImp implements Translate {
    Map<String, String> loadStoresDictionary;
    @Override
    public String englishToVietnamese(String keyword) {
        loadStoresDictionary = Dictionary.stores();
        String result = loadStoresDictionary.get(keyword);
        if(result==null){
            return "Not Found";
        }else{
            return result;
        }
    }
}
