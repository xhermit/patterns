package com.xhermit.patterns.prototype;
/**
 * 测试原型模式
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   Apr 28, 2011 7:01:38 PM
 */
public class Test {

	public static void main(String[] args) {
       Mail mail=new Mail();
       mail.setReceiver("GG.Bond@xx.com");
       mail.setAppellation("先生");
       
       System.out.println(mail.toString());
       try {
		Mail mail2=(Mail)mail.clone();
		 mail2.setReceiver("Conan@xx.com");
		 System.out.println(mail2.toString());
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
       
	}

}
