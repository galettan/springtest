package com.example.demo.services;

import com.example.demo.entities.SalesmanEntity;
import com.example.demo.models.Salesman;

import java.util.List;

public interface SalesmanService {
    SalesmanEntity createSalesman(SalesmanEntity salesman);
    List<Salesman> getSalesmen();
    SalesmanEntity getSalesman(Long id);

}
