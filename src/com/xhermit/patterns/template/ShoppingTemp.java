package com.xhermit.patterns.template;
/**
 * 购物模板类父类（描述超市购物）
 * Template定义:
 *    定义一个操作中算法的骨架,将一些步骤的执行延迟到其子类中.
 *    其实Java的抽象类本来就是Template模式,因此使用很普遍.
 *
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   Apr 28, 2011 4:11:35 PM
 */
public abstract class ShoppingTemp {
   //选购
	protected abstract void choose();
	//收银台结算
	protected abstract void balance();
	//付款
	protected abstract void pay();
	/**
	 * 商场购物
	 * 这里定义了一些固定的流程。具体的步骤实现放到子类中
	 */
	public void shopping()
	{
		 this.choose();
		 this.balance();
		 this.pay();
	}
	
}
