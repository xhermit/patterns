package com.xhermit.patterns.composite;

/**
 * 
 * @description 树节点（叶子节点和枝干节点的抽象父类）
 * @author xhermit
 * @date 2011-5-6下午02:39:22
 * @version 1.0
 */
public abstract class Node {
	private String name;// 名称
	private Node parent;// 父节点

	public Node() {

	}

	public Node(String name) {
		this.name = name;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Node getParent() {
		return this.parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
