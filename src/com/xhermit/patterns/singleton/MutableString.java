package com.xhermit.patterns.singleton;

/**
 * http://www.ibm.com/developerworks/java/library/j-dcl/index.html 
 * This code creates a MutableString class at //4 that contains a String reference shared
 * by two threads at //3. Two objects are created, StringCreator and
 * StringReader, on two separate threads at lines //5 and //6, passing a
 * reference to the MutableString object. The StringCreator class enters an
 * infinite loop and creates String objects with the value "hello" at //1. The
 * StringReader also enters an infinite loop and checks to see if the current
 * String object has the value "hello" at //2. If it doesn't, the StringReader
 * thread prints out a message and stops. If the String class is immutable, you
 * should never see any output from this program. The only way for StringReader
 * to see the str reference to be anything other than a String object with
 * "hello" as its value is if the problem of out-of-order writes occurs.
 * 
 * @author xhermit
 * @date Apr 28, 2011 10:05:32 AM
 */
class StringCreator extends Thread {
	MutableString ms;

	public StringCreator(MutableString muts) {
		ms = muts;
	}

	public void run() {
		while (true)
			ms.str = new String("hello"); // 1
	}
}

class StringReader extends Thread {
	MutableString ms;

	public StringReader(MutableString muts) {
		ms = muts;
	}

	public void run() {
		while (true) {
			if (!(ms.str.equals("hello"))) // 2
			{
				System.out.println("String is not immutable!");
				break;
			}
		}
	}
}

public class MutableString {
	public String str; // 3

	public static void main(String args[]) {
		MutableString ms = new MutableString(); // 4
		new StringCreator(ms).start(); // 5
		new StringReader(ms).start(); // 6
	}
}
