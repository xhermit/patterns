package com.xhermit.patterns.bridge;
/**
 * 测试类
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   May 6, 2011 10:18:27 AM
 */
public class Client {

	/**
	 * @author xhermit
	 * @date May 6, 2011 10:18:22 AM
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// 定义一个实现化角色
		Implementor impl=new  ConcreteImplementorA ();
		// 定义一个抽象化角色
        Abstraction ab=new RefineAbstraction(impl);
        //执行相关操作
        ab.request();
	}

}
