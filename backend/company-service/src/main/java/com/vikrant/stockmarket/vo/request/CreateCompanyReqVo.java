package com.vikrant.stockmarket.vo.request;

import java.util.List;

import javax.validation.Valid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author vikrant
 * 04-18
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCompanyReqVo extends UpdateCompanyReqVo {

	@Valid
    List<CompanyStockExchangeRequestVo> companyStockExchangeList;

	//@Email(message = "email error")
	//private String username;
}
