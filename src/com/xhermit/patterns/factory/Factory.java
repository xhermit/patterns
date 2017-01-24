package com.xhermit.patterns.factory;
/**
 * 工厂类(主要是静态工厂方法)
 *   特点: 一个抽象产品类
 *    
 * @author xhermit
 * @date Apr 27, 2011 9:43:30 AM
 */
public class Factory {
     /**
      * 静态工厂方法
      * 特征：1） public static 静态开放
      *      2） 返回类型是指定实例的父类（或本身），这样返回可是返回类型的本身或子类
      *      3)  输入条件（函数参数一般作为生成实例的判断依据）
      * @author xhermit
      * @date Apr 27, 2011 9:47:06 AM
      * @param className 指定实例的类名
      * @return
      *
      */
	public static ISample create(String className)
	{
		if(className.equals("SampleA"))
		{
			return new SampleA();
		}else if(className.equals("SampleB"))
		{
			return new SampleB();
		}
		return null;
	}
	public static void main(String[] args) {
       ISample  s=Factory.create("SampleA");
       s.doSomething();
       s=Factory.create("SampleB");
       s.doSomething();
	}

}
