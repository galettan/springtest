package com.example.demo.repositories;

import com.example.demo.entities.SalesmanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesmanRepository extends JpaRepository<SalesmanEntity, Long> {
}
