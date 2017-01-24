package com.xhermit.patterns.decorator;
/**
 * 测试
 * @author xhermit
 * @date   May 2, 2011 11:18:30 AM
 */
public class Client {

	public static void main(String[] args) {
       Component comp=new ConcreteComponent();
       Decorator dec=new ConcreteDecorator(comp);
       //客户端不变, 但已增加了附加的功能实现
       dec.operate();
	}

}
