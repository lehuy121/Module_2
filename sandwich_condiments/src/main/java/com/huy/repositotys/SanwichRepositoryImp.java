package com.huy.repositotys;

import com.huy.models.Sanwich;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SanwichRepositoryImp implements SanwichRepository {
    private static Map<Integer, Sanwich> mapSanwich = new HashMap<Integer, Sanwich>();

    static {
        mapSanwich.put(1, new Sanwich(1, true,false,true, false));
    }

    @Override
    public void saveCondiment() {

    }

    @Override
    public Sanwich getCondiment(Integer id) {
    return mapSanwich.get(id);
    }
}
