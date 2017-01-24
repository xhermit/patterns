package com.xhermit.patterns.abstractfactory;
/**
* 女性工厂
* @author xhermit
* @date   Apr 28, 2011 9:47:17 AM
*/
public class FemaleFactory extends HumanFactory {

	//生成女性美国人
	public Human createAmerican() {
		return createHuman(HumanEnum.AmericanFemale);
	}

	//生成女性中国人
	public Human createChinese() {
		return createHuman(HumanEnum.ChineseFemale);
	}

}

