package com.vikrant.stockmarket.service;

import java.io.InputStream;

import com.vikrant.stockmarket.exception.ServiceException;
import com.vikrant.stockmarket.vo.UploadResultVo;

public interface IUploadService {

	public UploadResultVo saveExcelStockPrices(InputStream inputStream, String filename) throws ServiceException;
}
