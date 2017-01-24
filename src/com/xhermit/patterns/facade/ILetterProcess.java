package com.xhermit.patterns.facade;
/**
 * 
 * @description  抽象出一个写信的过程
 * @author       xhermit
 * @date         2011-5-6下午03:41:10
 * @version      1.0
 */
public interface ILetterProcess {
	//书写信的内容
   void writeContext(String context);
   //写信封
   void writeEnvelope(String address);
   //把信放入信封
   void letterIntoEnvelope();
   //邮递
   void sendLetter();
}
