package com.xhermit.patterns.abstractfactory;
/**
 * 男性工厂
 * @author xhermit
 * @date   Apr 28, 2011 9:47:17 AM
 */
public class MaleFactory extends HumanFactory {

	//生成男性美国人
	public Human createAmerican() {
		return createHuman(HumanEnum.AmericanMale);
	}

	//生成男性中国人
	public Human createChinese() {
		return createHuman(HumanEnum.ChineseMale);
	}

}
