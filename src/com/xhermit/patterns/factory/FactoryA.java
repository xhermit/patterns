package com.xhermit.patterns.factory;

import java.util.HashMap;

/**
 * 工厂方法和动态类装入器组合在一起应用
 * 这里使用延迟始化(Lazy initialization):一个对象初始化后不释放，再次使用则直接从内存中拿取。
 * @author xhermit
 * @date   Apr 27, 2011 9:56:38 AM
 */
public class FactoryA {
	
    //存放实例的池
    private static HashMap<SampleEnum,ISample> pool=new HashMap<SampleEnum,ISample>();
    /**
     * 工厂方法：
     *   默认生成SampleA,也可也指定ISample的实现子类
     *   
     * @author xhermit
     * @date Apr 27, 2011 9:58:53 AM
     * @return
     *
     */
    public  synchronized static ISample create(SampleEnum se)
	{
    	try {
    		if(pool.containsKey(se))
    		{
    			System.out.println("The Object in the Pool!");
    			return pool.get(se);
    		}else{
				Class c=Class.forName(se.getValue());
				Object o= c.newInstance();
				if(o instanceof ISample)
				{
					ISample dest= (ISample)o;
					pool.put(se, dest);
					return dest;
				}
    		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
    
	public static void main(String[] args) {
        ISample s=FactoryA.create(SampleEnum.SampleA);
		s.doSomething();
		
		s=FactoryA.create(SampleEnum.SampleB);
		s.doSomething();
		//从池中取出实例
		s=FactoryA.create(SampleEnum.SampleA);
	}

}
