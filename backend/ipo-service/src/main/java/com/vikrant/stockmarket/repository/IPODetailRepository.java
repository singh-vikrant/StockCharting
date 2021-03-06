package com.vikrant.stockmarket.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.vikrant.stockmarket.dto.IPODetailDto;
import com.vikrant.stockmarket.entity.IPODetail;

@Repository
public interface IPODetailRepository extends JpaRepository<IPODetail, Long> {

	@Query(value = "select new com.vikrant.stockmarket.dto.IPODetailDto(ipo, co, se) " +
	   		"from IPODetail ipo\n" +
	   		"LEFT JOIN ipo.company co\n" +
	   		"LEFT JOIN ipo.stockExchange se")
	public Page<IPODetailDto> pageIPODetails(Pageable pageable);

}
