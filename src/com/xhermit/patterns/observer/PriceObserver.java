package com.xhermit.patterns.observer;

import java.util.Observable;
import java.util.Observer;
/**
 * 价格修改观察者
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   Apr 28, 2011 4:48:59 PM
 */
public class PriceObserver implements Observer {
    private float  price=0.0f;
	public void update(Observable o, Object arg) {
		if(o.getClass().getName().indexOf("Product")!=-1)
		{
			System.out.println("~~~~~");
		}
		if(arg instanceof Float)
		{
			price=(Float)arg;
			System.out.println("PriceObserver :price changet to "+price);
		}
	}

}
