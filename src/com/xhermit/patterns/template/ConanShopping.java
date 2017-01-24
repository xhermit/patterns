package com.xhermit.patterns.template;
/**
 * 柯南购物
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   Apr 28, 2011 4:26:27 PM
 */
public class ConanShopping extends ShoppingTemp {
	@Override
	protected void choose() {
		 System.out.println("柯南选了《福尔摩斯全集》。");
	}
	@Override
	protected void balance() {
		 System.out.println("收银员完成结算");
	}

	@Override
	protected void pay() {
		 System.out.println("柯南现金付款。");
	}

}
