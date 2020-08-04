package com.vikrant.stockmarket.service.impl;

import java.util.List;

import com.vikrant.stockmarket.exception.ServiceErrorCode;
import com.vikrant.stockmarket.exception.ServiceException;
import com.vikrant.stockmarket.repository.CompanySectorRepository;
import com.vikrant.stockmarket.repository.SectorRepository;
import com.vikrant.stockmarket.service.ISectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikrant.stockmarket.entity.CompanySector;
import com.vikrant.stockmarket.entity.Sector;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SectorServiceImpl implements ISectorService {

	@Autowired
	private SectorRepository sectorRepository;
	
	@Autowired
	private CompanySectorRepository companySectorRepository;
	
	@Override
	public List<Sector> findAll() {
		List<Sector> result = this.sectorRepository.findAll();
		return result;
	}
	
	@Override
	public List<CompanySector> findCompaniesBySectorId(Long sectorId) throws ServiceException {
		this.sectorRepository.findById(Long.valueOf(sectorId))
			.orElseThrow(() -> new ServiceException(ServiceErrorCode.BAD_REQUEST, "sector id not found"));
		return this.companySectorRepository.findBySectorId(Long.valueOf(sectorId));
	}
}
