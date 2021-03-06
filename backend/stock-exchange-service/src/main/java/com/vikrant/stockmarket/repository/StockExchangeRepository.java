package com.vikrant.stockmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikrant.stockmarket.entity.StockExchange;

@Repository
public interface StockExchangeRepository extends JpaRepository<StockExchange, Long>{

}
