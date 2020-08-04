package com.vikrant.stockmarket.controller.api;

import com.vikrant.stockmarket.entity.CompanySector;
import com.vikrant.stockmarket.entity.Sector;
import com.vikrant.stockmarket.exception.ServiceException;
import com.vikrant.stockmarket.pojo.Result;
import com.vikrant.stockmarket.service.ISectorService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author vikrant
 * 04-11
 */
@Slf4j
@RestController
@RequestMapping("/api/sector")
public class SectorApiController {

	@Autowired
	private ISectorService sectorService;
	
	@GetMapping("/sayHello")
    public Result<String> hello() {
      log.info("sector service /api/sector/sayHello run");
      return new Result<String>("hello, this is the greet from sector service /api/sector/sayHello, it's a oauth protect resource.");
    }
	
	@GetMapping("/list")
    public Result<List<Sector>> findAll() {
      log.info("sector service /api/sector/list run");
      return new Result<List<Sector>>(this.sectorService.findAll());
    }
	
	@GetMapping("/{sectorId}/companies")
    public Result<List<CompanySector>> findCompaniesBySectorId(
    		@PathVariable(value="sectorId",required = true) long sectorId) throws ServiceException {
      log.info("sector service /"+sectorId+"/companies run");
      return new Result<List<CompanySector>>(this.sectorService.findCompaniesBySectorId(Long.valueOf(sectorId)));
    }
}
