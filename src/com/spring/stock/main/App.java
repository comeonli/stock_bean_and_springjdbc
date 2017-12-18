/**
 ********************************************************
 *                                                      *
 * Copyright © 2017-2017 HGST.REC   All rights reserved.*
 *                                                      *
 * ******************************************************
 * @Package: com.spring.stock.main                            
 * @author: fly                                     
 * @date: Dec 18, 2017 4:07:50 PM                               
 
 */
package com.spring.stock.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.stock.bo.impl.StockBoImpl;
import com.spring.stock.model.Stock;

/**
 * @author fly
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		StockBoImpl bo = (StockBoImpl) context.getBean("stockBoImpl");
		
		Stock stock = new Stock();
		
		stock.setCodeId(new Long(100));
		stock.setStockCode("1123");
		stock.setStockName("stock-update");
		
//		bo.save(stock);
//		bo.update(stock);
//		bo.move(stock);
		Stock stock2 = bo.findByStockCode(new Long(100));
		
//		System.out.println("stock insert complete.");
//		System.out.println("stock update complete");
//		System.out.println("stock delete complete");
		
		System.out.println(stock2.toString());
		
	}
}
