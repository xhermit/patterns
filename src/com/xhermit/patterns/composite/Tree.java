package com.xhermit.patterns.composite;
/**
 * 
 * @description   树结构
 * @author       xhermit
 * @date         2011-5-6下午02:41:17
 * @version      1.0
 */
public class Tree {
     private Node  root;//根节点
     public  Tree()
     {
    	 
     }
     public Tree(Node root)
     {
    	 this.root=root;
     }
     public void setRoot(Node root)
     {
    	 this.root=root;
     }
}
