package com.vikrant.stockmarket.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vikrant.stockmarket.entity.CompanySector;

@Repository
public interface CompanySectorRepository extends JpaRepository<CompanySector, Long> {
	
	public List<CompanySector> findBySectorId(Long sectorId);
}
