/**
 ********************************************************
 *                                                      *
 * Copyright © 2017-2017 HGST.REC   All rights reserved.*
 *                                                      *
 * ******************************************************
 * @Package: com.spring.stock.bo                            
 * @author: fly                                     
 * @date: Dec 18, 2017 11:17:51 AM                               
 
 */
package com.spring.stock.bo;

import com.spring.stock.model.Stock;

/**
 * @author fly
 *
 */
public interface StockBo {
	void save(Stock stock);
	void update(Stock stock);
	void move(Stock stock);
	Stock findByStockCode(Long stockCode);
}
