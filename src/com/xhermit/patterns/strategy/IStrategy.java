package com.xhermit.patterns.strategy;
/**
 *  将相似的操作部分，不同实现的部分抽象出来
 *  这里以压缩文件举例
 * @author xhermit
 * @mail  xhermit@yeah.net
 * @date   Apr 28, 2011 6:03:43 PM
 */
public interface IStrategy {
	//压缩文件
   void compress ();
}
