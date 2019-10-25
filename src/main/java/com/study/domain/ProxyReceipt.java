package com.study.domain;

import java.time.LocalDate;
import java.util.List;

public class ProxyReceipt implements Receipt {
    private final ImmutableReceipt immutableReceipt;
    private LocalDate expirationDate;

    public ProxyReceipt(ImmutableReceipt immutableReceipt) {
        this.immutableReceipt = immutableReceipt;
        this.expirationDate = immutableReceipt.getExpirationDate();
        System.out.println("Expiration date is " + expirationDate.toString());
    }

    public List<String> getMedicinesList() {
        return immutableReceipt.getMedicinesList();
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
        System.out.println("Expiration date changed to " + expirationDate.toString());
    }
}
