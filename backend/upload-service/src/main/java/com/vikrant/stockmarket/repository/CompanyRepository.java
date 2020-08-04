package com.vikrant.stockmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikrant.stockmarket.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{

}
