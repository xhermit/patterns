package com.xhermit.patterns.command;
/**
 * 
 * @description  调用者
 * @author       xhermit
 * @date         2011-5-6下午05:28:30
 * @version      1.0
 */
public class Invoker {
  private Command command;
  public Invoker(Command command)
  {
	  this.command=command;
  }
  public void doAction()
  {
	  command.execute();
  }
}
