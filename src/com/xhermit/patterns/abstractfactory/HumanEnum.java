package com.xhermit.patterns.abstractfactory;
/**
 * 人类（产品族类名枚举）
 * @author xhermit
 * @date   Apr 28, 2011 9:21:03 AM
 */
public enum HumanEnum {
  ChineseMale("com.xhermit.patterns.abstractfactory.ChineseMale"),
  ChineseFemale("com.xhermit.patterns.abstractfactory.ChineseFemale"),
  AmericanMale("com.xhermit.patterns.abstractfactory.AmericanMale"),
  AmericanFemale("com.xhermit.patterns.abstractfactory.AmericanFemale");
  
  private String value="";
  private HumanEnum(String value)
  {
	  this.value=value;
  }
  public String getValue()
  {
      return value;	  
  }
}
