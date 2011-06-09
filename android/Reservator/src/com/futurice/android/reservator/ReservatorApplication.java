package com.futurice.android.reservator;

import com.futurice.android.reservator.model.DataProxy;
import com.futurice.android.reservator.model.dummy.DummyDataProxy;
import com.futurice.android.reservator.model.soap.SoapDataProxy;

import android.app.Application;

public class ReservatorApplication extends Application {
	private DataProxy proxy;
	public DataProxy getDataProxy(){	
		return proxy;
	}
	
	@Override
	public void onCreate(){
		proxy = new DummyDataProxy();
		proxy.init();
	}
}