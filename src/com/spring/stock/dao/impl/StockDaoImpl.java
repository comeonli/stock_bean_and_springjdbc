/**
 ********************************************************
 *                                                      *
 * Copyright © 2017-2017 HGST.REC   All rights reserved.*
 *                                                      *
 * ******************************************************
 * @Package: com.spring.stock.dao.impl                            
 * @author: fly                                     
 * @date: Dec 18, 2017 1:21:24 PM                               
 
 */
package com.spring.stock.dao.impl;


import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.spring.stock.dao.StockDao;
import com.spring.stock.model.Stock;
import com.spring.stock.model.StockRowMapper;

/**
 * @author fly
 *
 */
public class StockDaoImpl extends JdbcDaoSupport implements StockDao{

	/* (non-Javadoc)
	 * @see com.spring.stock.dao.StockDao#save(com.spring.stock.model.Stock)
	 */
	@Override
	public void save(Stock stock) {
		
		String sql ="INSERT INTO stock (STOCK_ID,STOCK_CODE,STOCK_NAME) VALUES(?,?,?)";
		
		getJdbcTemplate().update(sql, new Object[] {stock.getCodeId(),stock.getStockCode(),stock.getStockName()});
		
		
	}

	/* (non-Javadoc)
	 * @see com.spring.stock.dao.StockDao#update(com.spring.stock.model.Stock)
	 */
	@Override
	public void update(Stock stock) {
		// TODO Auto-generated method stub
		String sql = "UPDATE stock set STOCK_CODE=? ,STOCK_NAME= ? WHERE STOCK_ID = ?";
		
		getJdbcTemplate().update(sql, new Object[] {stock.getStockCode(),stock.getStockName(),stock.getCodeId()});
	}

	/* (non-Javadoc)
	 * @see com.spring.stock.dao.StockDao#move(com.spring.stock.model.Stock)
	 */
	@Override
	public void move(Stock stock) {
		// TODO Auto-generated method stub
		String sql ="DELETE FROM stock WHERE STOCK_ID= ?";
		
		getJdbcTemplate().update(sql, new Object[] {stock.getCodeId()});
	}

	/* (non-Javadoc)
	 * @see com.spring.stock.dao.StockDao#findByStockCode(java.lang.String)
	 */
	@Override
	public Stock findByStockCode(Long stockCode) {
		// TODO Auto-generated method stub
		String sql ="SELECT * FROM stock WHERE STOCK_ID = ?";
		
		Stock stock = (Stock) getJdbcTemplate().queryForObject(sql, new Object[] {stockCode},new StockRowMapper());
		
		
		return stock;
	}

}
