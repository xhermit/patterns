package com.xhermit.patterns.decorator;
/**
 * 被装饰
 * @author xhermit
 * @date   May 2, 2011 11:07:36 AM
 */
public class ConcreteComponent implements Component {

	@Override
	public void operate() {
          System.out.println("ConcreteComponent operate()...");
	}

}
