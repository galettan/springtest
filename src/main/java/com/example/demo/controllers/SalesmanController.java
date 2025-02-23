package com.example.demo.controllers;

import com.example.demo.entities.SalesmanEntity;
import com.example.demo.models.Salesman;
import com.example.demo.services.SalesmanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("salesmen")
public class SalesmanController {
    private final SalesmanService salesmanService;

    public SalesmanController(SalesmanService salesmanService) {
        this.salesmanService = salesmanService;
    }

    /**
     *
     * @return salesmen list
     */
    @GetMapping
    public ResponseEntity<List<Salesman>> getSalesmen() {
        return new ResponseEntity<>(salesmanService.getSalesmen(), HttpStatus.OK);
    }

    /**
     * Create provided salesmen list
     * @param salesman salesman
     * @return Response created or error
     */
    @PostMapping
    public ResponseEntity<SalesmanEntity> createSalesman(@RequestBody SalesmanEntity salesman) {
        salesmanService.createSalesman(salesman);
        return new ResponseEntity<>(salesman, HttpStatus.CREATED);
    }

    /**
     * Returns current payroll depending on sales for provided salesman's id
     * @param id
     * @return Payroll
     */
    @GetMapping("{id}/payroll")
    public String getPayroll(@PathVariable("id") Long id) {
        return null;
        //return salesmanService.getPayroll(id);
    }
}
