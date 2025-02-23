package com.example.demo.models;

import java.util.Objects;

public class Payroll {
    private Long baseSalary;
    private Long variableSalary;

    public Long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Long baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Long getVariableSalary() {
        return variableSalary;
    }

    public void setVariableSalary(Long variableSalary) {
        this.variableSalary = variableSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Payroll payroll = (Payroll) o;
        return Objects.equals(baseSalary, payroll.baseSalary) && Objects.equals(variableSalary, payroll.variableSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseSalary, variableSalary);
    }

}
