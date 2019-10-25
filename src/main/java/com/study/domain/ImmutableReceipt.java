package com.study.domain;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class ImmutableReceipt implements Receipt {
    private final List<String> medicinesList;
    private final LocalDate expirationDate;

    public ImmutableReceipt(List<String> medicinesList, LocalDate expirationDate){
        this.medicinesList = Collections.unmodifiableList(medicinesList);
        this.expirationDate = expirationDate;
    }

    public List<String> getMedicinesList() {
        return medicinesList;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

}
