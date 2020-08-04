package com.vikrant.stockmarket.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.vikrant.stockmarket.entity.Company;
import com.vikrant.stockmarket.entity.IPODetail;
import com.vikrant.stockmarket.entity.StockExchange;
import org.springframework.beans.BeanUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IPODetailDto implements Serializable {

	private static final long serialVersionUID = -7768638632292015621L;

	private long id;

    private Company company;

    private StockExchange stockExchange;
    
	private BigDecimal pricePerShare;

    private long totalShares;

    private Timestamp openDatetime;

    private String remarks;
	
	public IPODetailDto(IPODetail ipoDetail, Company company, StockExchange se) {
		BeanUtils.copyProperties(ipoDetail, this);
		this.company = company;
		this.stockExchange = se;
	}
}
