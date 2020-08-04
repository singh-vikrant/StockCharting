package com.vikrant.stockmarket.controller.rest;

import com.vikrant.stockmarket.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author vikrant
 * 04-10
 */
@Slf4j
@RestController
@RequestMapping("/rest/company")
public class CompanyRestController {

    @GetMapping("/hello")
    public Result<String> hello() {
      log.info("company service /rest/company/hello run");
      return new Result<String>("hello, this is the greet from company service /rest/company/hello, it's a common api.");
    }

}
