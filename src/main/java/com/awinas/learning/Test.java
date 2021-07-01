package com.awinas.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {

//		// L1
//
//		// List l2 = l1.stream().filter((e) -> e%2!=0 ).forEach((e) - > sysout(e))
//
//		// l1 l2 int array list
//		// fuc to print odd num from list
//
//		Runnable r1= new Runnable() {
//
//			@Override
//			public void run() {
//				
//					//l1.stream().filter((e) -> e%2!=0 ).forEach((e) -> sysout(e))	
//				
//				
//			}
//			
//		}
//		
//		Runnable r2= new Runnable() {
//			@Override
//			public void run() {
//				//l2.stream().filter((e) -> e%2!=0 ).forEach((e) -> sysout(e))	
//			}
//		}
//		
////		Thread t1 = new Thread(r1);
////		Thread t2 = new Thread(r2);
////		
////		t1.start();
////		t2.start();
//
//		// List<Runnable> task = new
//		ExecutorService ec = Executors.newFixedThreadPool(2);
//		ArrayList<Runnable> task = new ArrayList<>();
//		task.add(r1);
//		task.add(r2);
//	//	ec.invokeAll(task );

		String a = "123";
//		Integer newInt = Integer.valueOf(a);
//		System.out.println(newInt);
		Integer out = 0;
		for (char c : a.toCharArray()) {
			int val = (int) c - 48;
			out = (out * 10) + val;
		}
		System.out.println(out);
	}

}
