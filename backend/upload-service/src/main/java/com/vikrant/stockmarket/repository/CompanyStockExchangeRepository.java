package com.vikrant.stockmarket.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vikrant.stockmarket.entity.CompanyStockExchange;

@Repository
public interface CompanyStockExchangeRepository extends JpaRepository<CompanyStockExchange, Long>{

	public List<CompanyStockExchange> findByCompanyCodeAndStockexchange_Id(String companyCode, Long StockexchangeId);
}
