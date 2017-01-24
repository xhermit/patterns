package com.xhermit.patterns.facade;
/**
 * 
 * @description  写信具体实现
 * @author       xhermit
 * @date         2011-5-6下午03:44:00
 * @version      1.0
 */
public class LetterProcessImpl implements ILetterProcess {

	@Override
	public void writeContext(String context) {
		System.out.println("书写信的内容："+context);
	}

	@Override
	public void writeEnvelope(String address) {
		System.out.println("书写信封，收信人地址："+address);
	}

	@Override
	public void letterIntoEnvelope() {
		System.out.println("将信放入信封");
	}

	@Override
	public void sendLetter() {
		System.out.println("邮递信封...");
	}

}
