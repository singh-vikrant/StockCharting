package com.vikrant.stockmarket.service;

import com.vikrant.stockmarket.exception.ServiceException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.vikrant.stockmarket.dto.IPODetailDto;
import com.vikrant.stockmarket.entity.IPODetail;
import com.vikrant.stockmarket.vo.request.CreateOrUpdateIPODetailReqVo;

public interface IPODetailService {

	public Page<IPODetailDto> pageIPODetails(Pageable pageable);

	public IPODetail getByDetailId(long ipoDetailId) throws ServiceException;

	public IPODetail createIPODetail(CreateOrUpdateIPODetailReqVo reqVo) throws ServiceException;

	public IPODetail updateIPODetail(Long ipoDetailId, CreateOrUpdateIPODetailReqVo reqVo) throws ServiceException;
	
	public void deleteIPODetail(Long ipoDetailId) throws ServiceException;

}
