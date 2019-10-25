package com.study.domain;

import java.time.LocalDate;
import java.util.List;

public interface Receipt {
    List<String> getMedicinesList();
    LocalDate getExpirationDate();
}
