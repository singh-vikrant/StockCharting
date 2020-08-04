package com.vikrant.stockmarket.config;

import com.vikrant.stockmarket.filter.PreFilter;

//@Configuration
public class ZuulFilterConfig {
	
//	  @Bean
	  public PreFilter preFilter() {
		  return new PreFilter();
	  }

}
