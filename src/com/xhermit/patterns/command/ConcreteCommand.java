package com.xhermit.patterns.command;
/**
 * 
 * @description  命令实现类（不同的命令对应到不同的接收者）
 * @author       xhermit
 * @date         2011-5-6下午05:24:12
 * @version      1.0
 */
public class ConcreteCommand implements Command {
    private Receiver  rec;
    public ConcreteCommand(Receiver rec)
    {
    	this.rec=rec;
    }
    
	@Override
	public void execute() {
		rec.action();
	}

}
