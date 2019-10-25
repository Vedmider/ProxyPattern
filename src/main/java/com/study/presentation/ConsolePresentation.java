package com.study.presentation;

import com.study.domain.ImmutableReceipt;
import com.study.domain.ProxyReceipt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsolePresentation {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> medicinesList = new ArrayList<>();
        System.out.println("Enter list of medicines:");

        for (int i = 0; i < 6; i++) {
            String medicine = scanner.nextLine();
            if (medicine.equals("")) {
                continue;
            }
            if (!medicinesList.contains(medicine)) {
                medicinesList.add(medicine);
            }
        }

        ImmutableReceipt immutableReceipt = new ImmutableReceipt(medicinesList, LocalDate.now());
        ProxyReceipt mutableReceipt = new ProxyReceipt(immutableReceipt);
        System.out.println("Change expiration date of receipt to 7 days later");
        mutableReceipt.setExpirationDate(LocalDate.now().plusDays(7));

        System.out.println("END of program");
    }
}
