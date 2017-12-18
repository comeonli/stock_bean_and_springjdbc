/**
 ********************************************************
 *                                                      *
 * Copyright © 2017-2017 HGST.REC   All rights reserved.*
 *                                                      *
 * ******************************************************
 * @Package: com.spring.stock.model                            
 * @author: fly                                     
 * @date: Dec 18, 2017 11:15:06 AM                               
 
 */
package com.spring.stock.model;

import java.io.Serializable;

/**
 * @author fly
 *
 */
public class Stock implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long codeId;
	private String stockName;
	private String stockCode;
	
	
	public Long getCodeId() {
		return codeId;
	}
	public String getStockName() {
		return stockName;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setCodeId(Long codeId) {
		this.codeId = codeId;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	@Override
	public String toString() {
		return "Stock [codeId=" + codeId + ", stockName=" + stockName + ", stockCode=" + stockCode + "]";
	}
	
	
	
}
