package com.xhermit.patterns.singleton;
/**
 * 单例模式的第二种形式
 *  initialize the singleton lazily, creating it only when it is first used
 * (lazy initialization 缓冲)
 * 
 *  这里getInstance 方法加synchronized ,若没有，可能得到多个实例。
 * @author xhermit
 * @date   Apr 27, 2011 1:59:31 PM
 */
public class SingletonA {
	private static SingletonA instance=null;
	private SingletonA()
	{}
	public static synchronized  SingletonA getInstance()
	{
		if(null==instance)
		{
			instance=new SingletonA();
		}
		return instance;
	}
}

/**

=========== 参考文章===========
http://www.ibm.com/developerworks/java/library/j-dcl/index.html

http://www.javaworld.com/javaworld/jw-01-2001/jw-0112-singleton.html?page=3

http://www.blogjava.net/dreamstone/archive/2006/11/04/79026.html

http://www.blogjava.net/dreamstone/archive/2007/02/27/101000.html



*/