//: c05:dessert:Cookie.java
// Creates a library.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package org.vito.c5.dessert;

public class Cookie {
	public Cookie() {
		System.out.println("Cookie constructor");
	}

	void bite() {
		System.out.println("bite");
	}

	protected void biteWithPro() {
		System.out.println("bite() with protected");
	}
} // /:~
