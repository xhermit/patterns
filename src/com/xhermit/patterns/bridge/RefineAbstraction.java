package com.xhermit.patterns.bridge;
/**
 * 具体抽象化角色
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   May 6, 2011 10:02:09 AM
 */
public class RefineAbstraction extends Abstraction {
	// 覆写构造方法
	public RefineAbstraction(Implementor impl)
	{
		super(impl);
	}
	@Override
	public void request() {
		super.request();
		super.getImpl().doAnything();
	}

}
