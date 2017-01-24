package com.xhermit.patterns.proxy;
/**
 * 客户端，当然只看到代理类 以及开放出来的接口
 * @author xhermit
 * @date   Apr 28, 2011 11:31:18 AM
 */
public class Client {
	
	public static void main(String[] args) {
       Proxy p=new Proxy();
       p.doSomething();
	}

}
