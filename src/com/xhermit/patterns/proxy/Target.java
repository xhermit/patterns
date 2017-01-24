package com.xhermit.patterns.proxy;
/**
 * 需要使用的实体（包含需求的相关操作）
 * @author xhermit
 * @date   Apr 28, 2011 11:22:39 AM
 */
public class Target implements ITarget{
    /**
     * 具体的操作实现
     */
	public void doSomething() {
		System.out.println("Target doSomething().....");
	}

}
