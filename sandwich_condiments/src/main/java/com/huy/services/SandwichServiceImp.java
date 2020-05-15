package com.huy.services;

import com.huy.models.Sanwich;
import com.huy.repositotys.SanwichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SandwichServiceImp implements SandwichService {
    @Autowired
    SanwichRepository sanwichRepository;

    @Override
    public String getCondiment(Sanwich sanwich) {
        String result = "";
        if (sanwich.isLettuce()) {
            result += "Lettuce, ";
        }
        if (sanwich.isTomato()) {
            result += "Tomato, ";
        }
        if (sanwich.isMustard()) {
            result += "Mustard, ";
        }
        if (sanwich.isSprouts()) {
            result += "Sprouts";
        }
        return result;
    }


    @Override
    public String getListCondiment(Sanwich sanwich) {
        List<String> list = new ArrayList<String>();
        StringBuilder result = new StringBuilder();
        if (sanwich.isLettuce()) {
            list.add("Lettuce, ");
        }
        if (sanwich.isTomato()) {
            list.add("Tomato, ");
        }
        if (sanwich.isMustard()) {
            list.add("Mustard, ");
        }
        if (sanwich.isSprouts()) {
            list.add("Sprouts, ");
        }
        for (String condiment : list) {
            result.append(condiment);
        }
        return result.toString();
    }

}
