package com.example.demo.services;

import com.example.demo.entities.SalesmanEntity;
import com.example.demo.models.Payroll;
import com.example.demo.models.Salesman;
import com.example.demo.repositories.SalesmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SalesmanServiceImpl implements SalesmanService{
    @Autowired
    private SalesmanRepository salesmanRepository;

    public List<Salesman> getSalesmen() {
        List<SalesmanEntity> salesmanEntities = salesmanRepository.findAll();
        List<Salesman> salesmen = new ArrayList<>();
        salesmanEntities.forEach(e -> salesmen.add(new Salesman(e)));
        return salesmen;
    }

    public SalesmanEntity createSalesman(SalesmanEntity salesman) {
        salesmanRepository.save(salesman);
        return salesman;
    }

    @Override
    public SalesmanEntity getSalesman(Long id) {
        Optional<SalesmanEntity> salesman = salesmanRepository.findById(id);
        return salesman.orElse(null);
    }

    public String getPayroll(Long id) {
            Optional<SalesmanEntity> salesmanOptional = salesmanRepository.findById(id);
            if (salesmanOptional.isEmpty()) {
                return "not found";
            }
        Payroll payroll = calculatePayroll(salesmanOptional.get());
            return "found";
    }

    private Payroll calculatePayroll(SalesmanEntity salesmanEntity) {
        Payroll payroll = new Payroll();

        payroll.setBaseSalary(1400L);
        payroll.setVariableSalary(calculateVariable(salesmanEntity));
        return payroll;
    }

    private Long calculateVariable(SalesmanEntity salesmanEntity) {
        return 1400L;
    }


}
