package com.xhermit.patterns.state;

/**
 * 测试类
 * 
 * @author xhermit
 * @date May 7, 2011 11:09:32 AM
 */
public class Test {

	public static void main(String[] args) {
		IState s = new ConcreteStateA();
		Context con = new Context(s);
		con.request();
		IState s2 = new ConcreteStateB();
		con.setState(s2);
		con.request();
	}

}
