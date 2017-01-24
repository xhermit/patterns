package com.xhermit.patterns.abstractfactory;
/**
 * 抽象类（美国人） ，产品等级
 * 这里可以实现一些产品族的共同方法。
 * 
 * @author xhermit
 * @date   Apr 28, 2011 9:01:55 AM
 */
public abstract class AbstractAmerican implements Human{

	public void cry() {
		System.out.println("美国人会哭~");
	}

	public void laugh() {
		System.out.println("美国人大笑~");
	}

	public void talk() {
		System.out.println("美国人说英语~");
	}

}
