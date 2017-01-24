package com.xhermit.patterns.prototype;

import java.util.Date;

/**
 * 这里假定邮件的几个属性，当然不全了.示例邮件转发多人（邮件中称谓要改变）。
 * 
 * 实现Cloneable接口,注意深拷贝和浅拷贝，还有属性的final设置
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   Apr 28, 2011 6:41:31 PM
 */
public class Mail implements Cloneable {
	//收件人
    private String receiver;
	//主题
	private String subject;
	//称谓
	private String appellation;
	//邮件内容
	private String context;
	//发送时间
	private Date date;
    
	public Mail()
	{
	  this.subject="五一快乐";
	  this.context="邀请你一起去逛西湖，有时间否？";
	  this.date=new Date();
	}
	
	/**
	 * 这调用 super.clone();
	 * @throws CloneNotSupportedException 
	 */
	protected Object clone() throws CloneNotSupportedException  {
		return super.clone();
	}



	@Override
	public String toString() {
		StringBuffer buffer=new StringBuffer();
		buffer.append("Mail \n 接受者:"+this.getReceiver());
		buffer.append("\n 主题:"+this.getSubject());
		buffer.append("\n 正文:");
		buffer.append("\n\t"+this.getAppellation());
		buffer.append("\n\t\t"+this.getContext());
		buffer.append("\n\t\t\t\t"+this.getDate().toLocaleString());
		return buffer.toString();
	}

	//setter  getter..
	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
