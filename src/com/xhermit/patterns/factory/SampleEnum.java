package com.xhermit.patterns.factory;
/**
 * 定义产品类的类名的枚举
 * @author xhermit
 * @date   Apr 28, 2011 8:51:14 AM
 */
public enum SampleEnum {
  SampleA("com.xhermit.patterns.factory.SampleA"),
  SampleB("com.xhermit.patterns.factory.SampleA");
  
  private String  value="";
  private SampleEnum (String v)
  {
	  value=v;
  }
  public String getValue()
  {
	  return value;
  }
}
