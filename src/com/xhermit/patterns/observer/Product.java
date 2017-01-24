package com.xhermit.patterns.observer;

import java.util.Observable;
/**
 * （被观察者）
 * 商品的名称或价格修改通知客户，使用通知者模式（JDK 中有Observable、Observer）
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   Apr 28, 2011 4:43:42 PM
 */

public class Product extends Observable {
	//商品名称
     private String  name;
     //商品价格
     private float price;
	public String getName() {
		return name;
	}
	/**
	 * 修改名称时候通知
	 * @author xhermit
	 * @date Apr 28, 2011 4:47:50 PM
	 * @param price
	 *
	 */
	public void setName(String name) {
		this.name = name;
		this.setChanged();//设置修改状态为true
		this.notifyObservers(name);//通知所有观察者
	}
	public float getPrice() {
		return price;
	}
	/**
	 * 修改价格时候通知
	 * @author xhermit
	 * @date Apr 28, 2011 4:47:50 PM
	 * @param price
	 *
	 */
	public void setPrice(float price) {
		this.price = price;
		this.setChanged();//设置修改状态为true
		this.notifyObservers(new Float(price));//通知所有观察者
	}

     
     
}
