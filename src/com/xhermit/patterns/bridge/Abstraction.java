package com.xhermit.patterns.bridge;

/**
 * 业务抽象角色
 * 
 * @author xhermit
 * @mail xhermit@yeah.net
 * @date May 6, 2011 9:54:32 AM
 */
public abstract class Abstraction {
	 // 定义对业务实现角色的引用 
	private Implementor impl;
	// 约束子类必须实现该构造函数
	public Abstraction(Implementor impl) {
		this.impl = impl;
	}
	// 获得实现化角色 
	public Implementor getImpl() {
		return impl;
	}
	// 自身的行为和属性
	public void request()
	{
		this.impl.doSomething();
	}
	
}
