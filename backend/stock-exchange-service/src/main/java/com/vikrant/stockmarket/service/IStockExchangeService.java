package com.vikrant.stockmarket.service;

import java.util.List;

import com.vikrant.stockmarket.dto.CompanyDto;
import com.vikrant.stockmarket.entity.StockExchange;

public interface IStockExchangeService {

	public List<StockExchange> findAll();
	
	public List<CompanyDto> listCompaniesByStockExchangeId(long stockExchangeId);
	
	public List<CompanyDto> listCompaniesByStockExchangeName(String stockExchangeName);
}
