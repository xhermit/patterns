package com.xhermit.patterns.observer;

import java.util.Observable;
import java.util.Observer;
/**
 * 名称修改观察者
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   Apr 28, 2011 4:48:59 PM
 */
public class NameObserver implements Observer {
    private String name=null;
	public void update(Observable o, Object arg) {
		if(arg instanceof String)
		{
			name=(String)arg;
			System.out.println("NameObserver :name changet to "+name);
		}
		
	}

}
