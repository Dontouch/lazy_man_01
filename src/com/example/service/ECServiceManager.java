package com.example.service;


import java.util.List;

import com.example.dao.serviceHistoryDao;
import com.example.util.Logger;
import com.example.vo.ServiceHistory;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class ECServiceManager extends Service{

	private static final String TAG = "ECServiceManager";
	
	
	private MyIECManager myIECManager;
	private serviceHistoryDao serviceHistroyDao;
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class MyIECManager extends Binder implements IECManager {

		@Override
		public void addServiceToHistory(ServiceHistory history) {
			
			Logger.d(TAG, "addServiceToHistory" + history.toString());

			if (serviceHistroyDao.findById(history.getId()))
				serviceHistroyDao.update(history);
			else
				serviceHistroyDao.add(history);
		}

		@Override
		public void clearServiceHistory() {
			Logger.d(TAG, "clearProductHistory");
			serviceHistroyDao.deleteAll();
		}

		@Override
		public List<ServiceHistory> getAllServiceHistory() {
			Logger.d(TAG, "getAllProductHistory");
			return serviceHistroyDao.getAll();
		}
	}

}
