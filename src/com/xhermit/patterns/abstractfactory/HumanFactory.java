package com.xhermit.patterns.abstractfactory;
/**
 * 工厂顶层 (本来要抽象成接口，为了提出共用方法createHuman 使用抽象类)
 * @author xhermit
 * @date   Apr 28, 2011 9:27:21 AM
 */
public abstract class HumanFactory {
	//制造中国人
    public abstract Human createChinese();
    //制造美国人
    public abstract Human createAmerican();
    /**
     * 根据人类产品类名称，反射生成实例
     * @author xhermit
     * @date Apr 28, 2011 9:35:31 AM
     * @param he 人类产品类名称
     * @return 人类实例
     *
     */
    protected Human createHuman(HumanEnum he)
    {
 	   Human h=null;
 	   if(he.getValue().equals(""))
 		   return h;
 	    try{
 	    	Class hClass=Class.forName(he.getValue());
 	    	h=(Human)hClass.newInstance();
 	    }catch(Exception e)
 	    {}
 	   
 	   return h ;
    }
}
