package com.xhermit.patterns.proxy;
/**
 * 代理类 
 *  特征：
 *   1.(has a)拥有目标类作为成员变量
 *   2. 和目标类继承同一接口，向客户提供相同接口
 * @author xhermit
 * @date   Apr 28, 2011 11:25:55 AM
 */
public class Proxy implements ITarget {
	//真正实现核心的目标类
     private  ITarget  t=null;
     
     public Proxy()
     {
    	 t=new Target();//默认指定一个目标类
     }
     /**
      * 指定代理类使用目标的父接口的不同实现
      * @param t
      */
     public Proxy(ITarget t)
     {
    	 this.t=t;
     }
     /**
      * 代理使用的相关操作
      */
	public void doSomething() {
		//在代理操作，可以进行身份校验等之类
		System.out.println("身份校验....");
		
		if(null!=t)
		   this.t.doSomething();
	}

}
