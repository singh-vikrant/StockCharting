package com.vikrant.stockmarket.feign;

import com.vikrant.stockmarket.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "auth-service") 
public interface AuthCheckFeignClient {
	
    // verify admin role
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    Result<String> isAdmin(@RequestHeader(name = "Authorization") String authHeader);

    // verify token
    @RequestMapping(value = "/authenticated", method = RequestMethod.GET)
    Result<String> hasToken(@RequestHeader(name = "Authorization") String authHeader);

}
