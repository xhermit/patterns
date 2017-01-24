package com.xhermit.patterns.facade;
/**
 * 
 * @description  村民(口述信的内容、提供收信人的地址)
 * @author       xhermit
 * @date         2011-5-6下午03:38:56
 * @version      1.0
 */
public class Villager {

	public static void main(String[] args) {
		LetterWriter writer=new LetterWriter();
		String context="GG Bond :\n You has forgot to take with your tools! \n\t\t   Mr.MiHu";
		String address="拼装学院 GG Bond";
		writer.writeLetter(context, address);
	}

}
