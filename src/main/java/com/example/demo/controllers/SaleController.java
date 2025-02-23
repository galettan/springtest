package com.example.demo.controllers;

import com.example.demo.entities.SaleEntity;
import com.example.demo.services.SaleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("sales")
public class SaleController {
    private final SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @PostMapping
    public ResponseEntity<SaleEntity> createSale(@RequestBody SaleEntity sale) {
        return new ResponseEntity<>(saleService.createSale(sale), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<com.example.demo.entities.SaleEntity>> getSales() {
        return new ResponseEntity<>(saleService.getSales(), org.springframework.http.HttpStatus.OK);
    }
}
