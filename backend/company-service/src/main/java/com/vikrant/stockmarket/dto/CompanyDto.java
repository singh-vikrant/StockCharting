package com.vikrant.stockmarket.dto;

import com.vikrant.stockmarket.entity.Company;
import com.vikrant.stockmarket.entity.CompanyStockExchange;
import com.vikrant.stockmarket.entity.Sector;
import com.vikrant.stockmarket.entity.StockExchange;
import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author vikrant
 * 04-16
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"companySector", "stockExchanges"})
public class CompanyDto extends Company {

	private static final long serialVersionUID = 7072917694387318518L;
    
	private Sector sector;
	
	private String companyCode;
	
	private StockExchange stockExchange;
	
	public CompanyDto(Company company, Sector sector, CompanyStockExchange cse, StockExchange se) {
		BeanUtils.copyProperties(company, this);
		this.sector = sector;
		this.companyCode = cse.getCompanyCode();
		this.stockExchange = se;
	}
}
