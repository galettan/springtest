package com.example.demo.models;

import com.example.demo.entities.SaleEntity;
import com.example.demo.entities.SalesmanEntity;

import java.util.List;

public class Salesman {
    private Long id;
    private String name;
    private List<SaleEntity> sales;

    public Salesman() {}

    public Salesman(SalesmanEntity salesman) {
        id = salesman.getId();
        name = salesman.getName();
        sales = salesman.getSales();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SaleEntity> getSales() {
        return sales;
    }

    public void setSales(List<SaleEntity> sales) {
        this.sales = sales;
    }
}
