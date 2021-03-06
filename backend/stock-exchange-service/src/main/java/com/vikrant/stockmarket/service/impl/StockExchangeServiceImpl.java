package com.vikrant.stockmarket.service.impl;

import java.util.List;

import com.vikrant.stockmarket.repository.CompanyRepository;
import com.vikrant.stockmarket.repository.StockExchangeRepository;
import com.vikrant.stockmarket.service.IStockExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikrant.stockmarket.dto.CompanyDto;
import com.vikrant.stockmarket.entity.StockExchange;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StockExchangeServiceImpl implements IStockExchangeService {

	@Autowired
	private StockExchangeRepository stockExchangeRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Override
	public List<StockExchange> findAll() {
		List<StockExchange> result = this.stockExchangeRepository.findAll();
		return result;
	}
	
	@Override
	public List<CompanyDto> listCompaniesByStockExchangeId(long stockExchangeId) {
		return this.companyRepository.listCompaniesByStockExchangeId(stockExchangeId);
	}
	
	@Override
	public List<CompanyDto> listCompaniesByStockExchangeName(String stockExchangeName) {
		return this.companyRepository.listCompaniesByStockExchangeName(stockExchangeName);
	}
}
