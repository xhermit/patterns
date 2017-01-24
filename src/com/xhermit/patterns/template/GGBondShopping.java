package com.xhermit.patterns.template;
/**
 * 猪猪侠购物
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   Apr 28, 2011 4:21:12 PM
 */
public class GGBondShopping extends ShoppingTemp {


	@Override
	protected void choose() 
	{
	  System.out.println("GG Bond 选了一些模板...");
	}
	@Override
	protected void balance() {
		System.out.println("收银员完成结算。");
	}


	@Override
	protected void pay() {
		System.out.println("GG Bond刷卡付款。");
	}

}
