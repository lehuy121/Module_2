package com.huy.repositotys;

import com.huy.models.Sanwich;

public interface SanwichRepository {
    void saveCondiment();
    Sanwich getCondiment(Integer id);
}
