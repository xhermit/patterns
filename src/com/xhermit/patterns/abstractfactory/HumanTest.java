package com.xhermit.patterns.abstractfactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * 测试抽象工厂模式代码
 * 
 * @author xhermit
 * @date   Apr 28, 2011 10:01:06 AM
 */
public class HumanTest {
	//男性工厂
	HumanFactory maleFac=null;
	//女性工厂
	HumanFactory femaleFac=null;
	//男性中国人
	Human  cMale=null;
	//女性美国人
	Human  aFemale=null;
	
	/**
	 *  1.  创建2类工厂
	 * @author xhermit
	 * @date Apr 28, 2011 10:02:41 AM
	 *
	 */
    @Before
	public void testCreateFactory()
	{
    	maleFac=new MaleFactory();
    	femaleFac=new FemaleFactory();
	}
    /**
     *  2.创建2类人
     * @author xhermit
     * @date Apr 28, 2011 10:03:05 AM
     *
     */
	@Test
   public void testCreateHuman()
   {
	   cMale=maleFac.createChinese();
	   aFemale=femaleFac.createAmerican();
   }
	/**
	 *  3 测试2类人的动作
	 * @author xhermit
	 * @date Apr 28, 2011 10:03:22 AM
	 *
	 */
	@After
	public void testHumanAction()
	{
		if(null!=cMale)
		{
			cMale.laugh();
			cMale.sex();
		}
		if(null!=aFemale)
		{
			aFemale.cry();
			aFemale.sex();
		}
	}
}
