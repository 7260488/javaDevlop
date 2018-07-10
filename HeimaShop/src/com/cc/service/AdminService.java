package com.cc.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.cc.dao.AdminDao;
import com.cc.domain.Category;
import com.cc.domain.Order;
import com.cc.domain.Product;

public interface AdminService {

	public List<Category> findAllCategory();


	public void saveProduct(Product product) ;
		


	public List<Order> findAllOrders() ;


	public List<Map<String, Object>> findOrderInfoByOid(String oid) ;
	

}
