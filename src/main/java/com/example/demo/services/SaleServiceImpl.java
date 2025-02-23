package com.example.demo.services;


import com.example.demo.entities.SaleEntity;
import com.example.demo.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public SaleServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public SaleEntity createSale(SaleEntity sale) {
        saleRepository.save(sale);
        return sale;
    }

    @Override
    public List<SaleEntity> getSales() {
        return saleRepository.findAll();
    }
}
