package com.vikrant.stockmarket.service;

import java.io.InputStream;
import java.util.List;

import com.vikrant.stockmarket.dto.ExcelCellDto;
import com.vikrant.stockmarket.exception.ServiceException;

public interface IExcelImportService {

	public List<ExcelCellDto> getListByExcel(InputStream inputStream, String fileName) throws ServiceException;
}
