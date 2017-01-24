package com.xhermit.patterns.state;
/**
 *  状态（State）角色
 * @author xhermit
 * @date   May 7, 2011 11:02:53 AM
 */
public interface IState {
	//特定状态相关的行为
  void handle();
}
