package com.vikrant.stockmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.vikrant.stockmarket.entity.Sector;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Long> {

}
