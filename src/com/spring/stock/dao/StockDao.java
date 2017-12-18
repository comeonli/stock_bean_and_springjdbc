/**
 ********************************************************
 *                                                      *
 * Copyright © 2017-2017 HGST.REC   All rights reserved.*
 *                                                      *
 * ******************************************************
 * @Package: com.spring.stock.dao                            
 * @author: fly                                     
 * @date: Dec 18, 2017 11:27:10 AM                               
 
 */
package com.spring.stock.dao;

import com.spring.stock.model.Stock;

/**
 * @author fly
 *
 */
public interface StockDao {
	void save(Stock stock);
	void update(Stock stock);
	void move(Stock stock);
	Stock findByStockCode(Long stockCode);
}
