package com.xhermit.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @description  枝干节点
 * @author       xhermit
 * @date         2011-5-6下午02:49:00
 * @version      1.0
 */
public class Branch extends Node {
      private List<Node> childNodes=new ArrayList<Node>();
	
	
	public Branch(){}
	
	public Branch(String name)
	{
		super(name);
	}
	/**
	 * 添加子节点
	 * @param node
	 */
	public void add(Node node)
	{
		node.setParent(this);//设置节点的父节点为该节点
		this.childNodes.add(node);
	}
	/**
	 * 移除子节点
	 * @param node
	 */
	public void remove(Node node)
	{
		if(childNodes.contains(node))
		{
			this.childNodes.remove(node);
			node.setParent(null);//将该节点的父节点清空
		}
	}

	public List<Node> getChildNodes() {
		return childNodes;
	}
	
}
