package com.xhermit.patterns.singleton;
/**
 * 第二种形式中关于成员变量同步问题（volatile JDK1.5以上）
 * 
 * @author xhermit
 * @date   Apr 27, 2011 2:46:44 PM
 */
public class SingletonB {
	/**
	 * volatile关键字就是提示VM：对于这个成员变量不能保存它的私有拷贝，而应直接与共享成员变量交互。
	*使用建议：在两个或者更多的线程访问的成员变量上使用volatile。
	*        当要访问的变量已在synchronized代码块中，或者为常量时，不必使用。
    *        由于使用volatile屏蔽掉了VM中必要的代码优化，所以在效率上比较低，
    *        因此一定在必要时才使用此关键字。
	*关于 Double-checked locking(双重检查加锁机制)查看以下文章:
	*http://www.ibm.com/developerworks/java/library/j-dcl/index.html
	*/
  private volatile static SingletonB instance=null;
  
  private SingletonB()
  {}
  public static SingletonB getInstance()
  {
	  if(null==instance)
	  {
		  //同步代码块
		  synchronized(SingletonB.class)
		  {
			  if(null==instance) //Double-checked locking
			   instance=new SingletonB();
		  }
	  }
	  return instance;
  }
  
  public static void main(String[] args)
  {
	    SingletonB s=SingletonB.getInstance();
	    System.out.println(null==s);
	    
  }
}
