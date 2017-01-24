package com.xhermit.patterns.observer;
/**
 * 测试
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   Apr 28, 2011 4:53:19 PM
 */
public class Test {

	public static void main(String[] args) {
		Product p=new Product();
        //1.生成观察者
		  NameObserver no=new NameObserver();
		  PriceObserver po=new PriceObserver();
         //2.注册观察者
		  p.addObserver(no);
		  p.addObserver(po);
		  
		  //3.触发观察者
		  p.setName("Java"); 
		  p.setPrice(100000000.0f);
		  
	}

}
