package com.xhermit.patterns.command;
/**
 * 
 * @description  测试
 * @author       xhermit
 * @date         2011-5-6下午05:33:27
 * @version      1.0
 */
public class Client {

	public static void main(String[] args) {
         Receiver rec=new Receiver();
         Command  com=new ConcreteCommand(rec);
         Invoker inv=new Invoker(com);
         inv.doAction();
	}

}
