package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.util.Objects;

@Entity
public class SaleEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "customer_name")
    private String customerName;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "salesman_id", nullable = false)
    private SalesmanEntity salesmanEntity;

    private Long accessoryAmount;

    @Column(name = "jlp")
    private Boolean jlp;

    @Column(name = "financed")
    private Boolean financed;

    public SaleEntity() {}

    public SaleEntity(String customerName, SalesmanEntity salesmanEntity, Long accessoryAmount, Boolean jlp,
                      Boolean financed) {
        this.customerName = customerName;
        this.salesmanEntity = salesmanEntity;
        this.accessoryAmount = accessoryAmount;
        this.jlp = jlp;
        this.financed = financed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public SalesmanEntity getSalesmanEntity() {
        return salesmanEntity;
    }

    public void setSalesmanEntity(SalesmanEntity salesmanEntity) {
        this.salesmanEntity = salesmanEntity;
    }

    public Long getAccessoryAmount() {
        return accessoryAmount;
    }

    public void setAccessoryAmount(Long accessoryAmount) {
        this.accessoryAmount = accessoryAmount;
    }

    public Boolean getJlp() {
        return jlp;
    }

    public void setJlp(Boolean jlp) {
        this.jlp = jlp;
    }

    public Boolean getFinanced() {
        return financed;
    }

    public void setFinanced(Boolean financed) {
        this.financed = financed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SaleEntity that = (SaleEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(customerName, that.customerName) &&
                Objects.equals(salesmanEntity, that.salesmanEntity) && accessoryAmount == that.accessoryAmount &&
                Objects.equals(jlp, that.jlp) && Objects.equals(financed, that.financed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName, salesmanEntity, accessoryAmount, jlp, financed);
    }
}
