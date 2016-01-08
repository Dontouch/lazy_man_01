package com.example.service;

import java.util.List;

import com.example.vo.ServiceHistory;

public interface IECManager {
	
	 void addProductToHistory(ServiceHistory history);
	 void clearProductHistory();
	 List<ServiceHistory> getAllProductHistory();
}
