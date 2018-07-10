package com.cc.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.cc.dao.AdminDao;
import com.cc.domain.Category;
import com.cc.domain.Order;
import com.cc.domain.Product;
import com.cc.service.AdminService;

public class AdminServiceImpl implements AdminService{

	public List<Category> findAllCategory() {
		AdminDao dao=new AdminDao();
		
		try {
			return dao.findAllCategory();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}


	public void saveProduct(Product product) {
		AdminDao dao=new AdminDao();
		
		try {
			 dao.saveProduct(product);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public List<Order> findAllOrders() {
		AdminDao dao=new AdminDao();
		List<Order> orderList=null;
		try {
			orderList = dao.findAllOrders();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderList;
	}


	public List<Map<String, Object>> findOrderInfoByOid(String oid) {
		AdminDao dao=new AdminDao();
		List<Map<String, Object>> mapList=null;
		try {
			mapList = dao.findOrderInfoByOid(oid);
		} catch (Exception e) {
			
		}
		return mapList;
	}

}
