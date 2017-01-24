package com.xhermit.patterns.state;
/**
 * 具体状态（Concrete State）角色
 * @author xhermit
 * @date   May 7, 2011 11:05:01 AM
 */
public class ConcreteStateB implements IState {

	@Override
	public void handle() {
		System.out.println("ConcreteStateB............");
	}

}
