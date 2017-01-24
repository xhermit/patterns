package com.xhermit.patterns.factory;
/**
 * 要实例化的子类A
 * @author xhermit
 * @date   Apr 27, 2011 9:42:13 AM
 */
public class SampleA implements ISample {

	
	public SampleA() {
		super();
		System.out.println("SampleA  constructor....");
	}

	public void doSomething() {
		System.out.println("SampleA  doSomething...");
	}

}
