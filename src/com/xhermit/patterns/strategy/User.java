package com.xhermit.patterns.strategy;
/**
 * 用户 使用策略类
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   Apr 28, 2011 6:10:57 PM
 */
public class User {
	IStrategy    s=null;
	
	public void compress(int i)
	{
		if(0==i)
		{
			s=new ZipStrategy();
		}else if(1==i)
		{
			s=new RARStrategy();
		}
	  if(s!=null)
		s.compress();
	}
	
	public static void main(String [] args)
	{
		//使用RAR格式压缩文件
		new User().compress(1);
	}
	
}
