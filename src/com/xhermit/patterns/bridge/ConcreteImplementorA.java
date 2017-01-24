package com.xhermit.patterns.bridge;
/**
 * 业务实现类A
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   May 6, 2011 10:04:00 AM
 */
public class ConcreteImplementorA implements Implementor {

	public void doAnything() {
		System.out.println("ConcreteImplementorA doAnything()....");
	}

	public void doSomething() {
		System.out.println("ConcreteImplementorA doSomething()....");
	}

}
