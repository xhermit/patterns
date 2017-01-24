package com.xhermit.patterns.decorator;
/**
 * 装饰角色类，这里增加功能实现
 * @author xhermit
 * @date   May 2, 2011 11:21:11 AM
 */
public class ConcreteDecorator extends Decorator {
	
	public ConcreteDecorator(Component comp) {
		super(comp);
	}
	
	@Override
	public void operate() {
		super.operate();
		doOtherThing();
	}
/**
 * 附加的功能实现
 * @author xhermit
 * @date May 2, 2011 11:21:01 AM
 *
 */
	public void doOtherThing() {
		System.out.println("doOtherThing.......");
	}

}
