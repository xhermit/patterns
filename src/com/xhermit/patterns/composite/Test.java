package com.xhermit.patterns.composite;

import java.util.List;

public class Test {

	public static void main(String[] args) {
       Tree tree=new Tree();
      
       Branch root=new Branch("ROOT");
       root.setParent(root);
       
       /*
                生成如下结构的Tree
         root
          |---A
          |---B
              |---C
              |---D
        */      
       Node a=new Leaf("A");
       Leaf c=new Leaf("C");
       Leaf d=new Leaf("D");
       Branch b=new Branch("B");
       b.add(c);
       b.add(d);
       
       root.add(a);
       root.add(b);
       
       tree.setRoot(root);
       System.out.println(printNodeChildInfo(root));
	}

	/**
	 * 打印节点信息（节点名称[子节点1，子节点2...子节点N[子子节点N1，子子节点N2]...]）
	 * @param node
	 * @return
	 */
	public static String printNodeChildInfo(Node node)
	{
		StringBuffer buffer=new StringBuffer("");
		if(node instanceof Leaf)
		{
			buffer.append(node.getName());
		}else if(node instanceof Branch){
			List<Node> nodes=((Branch) node).getChildNodes();
		     buffer.append(node.getName());
		     buffer.append("[");
		     for(Node n: nodes)
		     {
		    	 buffer.append(printNodeChildInfo(n)+",");
		     }
		     buffer.deleteCharAt(buffer.length()-1);
		     buffer.append("]");
		}
		return buffer.toString();
	}
	
}
