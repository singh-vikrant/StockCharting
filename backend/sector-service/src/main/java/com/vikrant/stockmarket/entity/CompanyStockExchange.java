package com.vikrant.stockmarket.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "t_company_stockexchange")
public class CompanyStockExchange implements Serializable {

	private static final long serialVersionUID = 8643067925329721810L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	@JsonIgnore
    private long id;

    @Column(name = "company_code")
    private String companyCode;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    @JsonIgnore
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stockexchange_id", nullable = false)
    private StockExchange stockExchange;
    
    public CompanyStockExchange(Company company, StockExchange stockExchange, String companyCode) {
    	this.company = company;
    	this.stockExchange = stockExchange;
    	this.companyCode = companyCode;
    }
}
