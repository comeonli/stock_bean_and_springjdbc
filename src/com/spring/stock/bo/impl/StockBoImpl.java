/**
 ********************************************************
 *                                                      *
 * Copyright © 2017-2017 HGST.REC   All rights reserved.*
 *                                                      *
 * ******************************************************
 * @Package: com.spring.stock.bo.impl                            
 * @author: fly                                     
 * @date: Dec 18, 2017 11:25:36 AM                               
 
 */
package com.spring.stock.bo.impl;

import com.spring.stock.bo.StockBo;
import com.spring.stock.dao.StockDao;
import com.spring.stock.model.Stock;

/**
 * @author fly
 *
 */
public class StockBoImpl implements StockBo{
	private StockDao stockDao;

	/* (non-Javadoc)
	 * @see com.spring.stock.bo.StockBo#save(com.spring.stock.model.Stock)
	 */
	@Override
	public void save(Stock stock) {
		this.stockDao.save(stock);
	}

	/* (non-Javadoc)
	 * @see com.spring.stock.bo.StockBo#update(com.spring.stock.model.Stock)
	 */
	@Override
	public void update(Stock stock) {
		this.stockDao.update(stock);
	}

	/* (non-Javadoc)
	 * @see com.spring.stock.bo.StockBo#move(com.spring.stock.model.Stock)
	 */
	@Override
	public void move(Stock stock) {
		this.stockDao.move(stock);
	}

	/* (non-Javadoc)
	 * @see com.spring.stock.bo.StockBo#findByStockCode(java.lang.String)
	 */
	@Override
	public Stock findByStockCode(Long stockCode) {
		return this.stockDao.findByStockCode(stockCode);
	}

	public StockDao getStockDao() {
		return stockDao;
	}

	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}

}
