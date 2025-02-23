package com.example.demo.services;

import com.example.demo.entities.SaleEntity;

import java.util.List;

public interface SaleService {
    SaleEntity createSale(SaleEntity sale);
    List<SaleEntity> getSales();
}
