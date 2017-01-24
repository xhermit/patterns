package com.xhermit.patterns.facade;
/**
 * 
 * @description  写信人（专门帮人写信、寄信）
 * @author       xhermit
 * @date         2011-5-6下午03:51:05
 * @version      1.0
 */
public class LetterWriter {
    //写信人熟悉这套流程
	private  ILetterProcess process=new LetterProcessImpl();
	/**
	 * 一体化服务：
	 * 
	 * 根据村民口述的信的内容和收信人地址写信、 发信
	 * @param context  信的内容
	 * @param address  收信人地址
	 */
	public  void writeLetter(String context,String address)
	{
		this.process.writeContext(context);
		this.process.writeEnvelope(address);
		this.process.letterIntoEnvelope();
		this.process.sendLetter();
	}
}
