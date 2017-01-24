package com.xhermit.patterns.singleton;
/**
 * Singleton模式主要作用是保证在Java应用程序中，
 *  一个类Class只有一个实例存在。(如 数据库连接 sockets counter等)
 *  
 *  应用举例：
 *  package java.lang; 
 *  
 *  public class Runtime {
 *  
 *    private static Runtime currentRuntime = new Runtime();
 *    
 *    public static Runtime getRuntime() { 
 * 	    return currentRuntime;
 *    }
 *      private Runtime() {}
 *     ...
 *    }
 *  
 *  (  特殊情况：
 *      使用Singleton并不能达到Singleton的目的，
 *      如有多个Singleton对象同时被不同的类装入器装载；
 *      在EJB这样的分布式系统中使用也要注意这种情况，因为EJB是跨服务器，跨JVM的。)
 *  
 *  
 *  
 *  下面是单例模式一种形式(static class members)。
 *  特征：1.私有静态属性 instance
 *       2.私有构造方法  private
 *       3.提供开放静态方法 getInstance
 *  
 * @author xhermit
 * @date   Apr 27, 2011 1:50:44 PM
 */
public class Singleton {
 private static Singleton instance=new Singleton();
 private Singleton()
 {}
 
 public static Singleton getIntance()
 {
	 return instance;
 }
}
