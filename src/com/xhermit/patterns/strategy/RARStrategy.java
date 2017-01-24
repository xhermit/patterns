package com.xhermit.patterns.strategy;
/**
 * 使用RAR格式压缩文件
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   Apr 28, 2011 6:07:01 PM
 */
public class RARStrategy implements IStrategy {

	public void compress() {
		//封装RAR压缩算法
		System.out.println("使用RAR格式压缩文件.");
	}

}
