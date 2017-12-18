/**
 ********************************************************
 *                                                      *
 * Copyright © 2017-2017 HGST.REC   All rights reserved.*
 *                                                      *
 * ******************************************************
 * @Package: com.spring.stock.model                            
 * @author: fly                                     
 * @date: Dec 18, 2017 2:35:50 PM                               
 
 */
package com.spring.stock.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


/**
 * @author fly
 *
 */
public class StockRowMapper implements RowMapper<Stock>	 {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public Stock mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Stock stock = new Stock();
		stock.setCodeId(rs.getLong("STOCK_ID"));
		stock.setStockName(rs.getString("STOCK_NAME"));
		stock.setStockCode(rs.getString("STOCK_CODE"));
		return stock;
	}

}
