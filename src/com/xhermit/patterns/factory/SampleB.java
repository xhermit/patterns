package com.xhermit.patterns.factory;
/**
 * 要实例化的子类B
 * @author xhermit
 * @date   Apr 27, 2011 9:42:13 AM
 */
public class SampleB implements ISample {

	
	public SampleB() {
		super();
		System.out.println("SampleB  constructor....");
	}

	public void doSomething() {
		System.out.println("SampleB  doSomething...");
	}

}
