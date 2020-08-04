package com.vikrant.stockmarket.service;

import javax.servlet.http.HttpServletRequest;
import com.vikrant.stockmarket.exception.ServiceException;
import com.vikrant.stockmarket.pojo.AuthResponse;

public interface UserTokenService {

	public AuthResponse getUserDetailFromToken(HttpServletRequest request) throws ServiceException;
}
