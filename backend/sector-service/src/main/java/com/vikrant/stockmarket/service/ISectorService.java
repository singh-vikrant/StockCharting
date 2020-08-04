package com.vikrant.stockmarket.service;

import java.util.List;

import com.vikrant.stockmarket.entity.CompanySector;
import com.vikrant.stockmarket.entity.Sector;
import com.vikrant.stockmarket.exception.ServiceException;

public interface ISectorService {

	public List<Sector> findAll();
	
	public List<CompanySector> findCompaniesBySectorId(Long sectorId) throws ServiceException;
}
