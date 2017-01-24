package com.xhermit.patterns.state;
/**
 * 环境（Context）角色
 * @author xhermit
 * @date   May 7, 2011 11:02:20 AM
 */
public class Context {
	private IState state=null;
	public Context()
	{
	}
	//一般该对象要初始化一个状态
	public Context(IState state)
	{
		this.state=state;
	}
	/**
	 * 请求操作，调用不同状态下的行为
	 * @author xhermit
	 * @date May 7, 2011 11:07:54 AM
	 *
	 */
	public void request()
	{
		if(null!=state)
		{
			state.handle();
		}
	}
	
	public IState getState() {
		return state;
	}
	//修改状态
	public void setState(IState state) {
		this.state = state;
	}

	
}
