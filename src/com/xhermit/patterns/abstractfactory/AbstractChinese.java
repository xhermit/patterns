package com.xhermit.patterns.abstractfactory;
/**
 * 抽象类（中国人） ，产品等级
 * 这里可以实现一些产品族的共同方法。
 * 
 * @author xhermit
 * @date   Apr 28, 2011 9:01:55 AM
 */
public abstract class AbstractChinese implements Human {

	public void cry() {
     System.out.println("中国人哀而不伤，小哭一次。。。");
	}

	public void laugh() {
		System.out.println("中国人大笑一次。。。");
	}

	public void talk() {
		System.out.println("中国人说中国话");
	}

}
