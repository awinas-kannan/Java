package com.awinas.learning.garbagecollection;

//gc2 cleared before gc1
public class GarbageCollector1 {

	public static void main(String[] args) {

		GarbageCollector1 gc1 = new GarbageCollector1();
		System.out.println(gc1);
		System.gc();

		gc1 = null;
		GarbageCollector1 gc2 = new GarbageCollector1();
		System.out.println(gc2);
		gc2 = null;

		System.gc();
	}

	// finalize method is called on object once
	// before garbage collecting it
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collector called");
		System.out.println("Object garbage collected : " + this);
	}
}
