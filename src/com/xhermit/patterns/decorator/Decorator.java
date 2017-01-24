package com.xhermit.patterns.decorator;
/**
 * 装饰角色，持有一个构件（Component）对象的实例，并定义一个与抽象构件接口一致的接口
 * @author xhermit
 * @date   May 2, 2011 11:10:20 AM
 */
public  class Decorator implements Component {
   private Component comp;

public Decorator(Component comp) {
	super();
	this.comp = comp;
}

	@Override
	public void operate() {
		comp.operate();
	}
}
