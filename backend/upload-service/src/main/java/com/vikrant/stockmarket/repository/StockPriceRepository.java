package com.vikrant.stockmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vikrant.stockmarket.entity.StockPrice;

@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice, Long>{

}
