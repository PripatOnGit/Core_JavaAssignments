package com.java;

public class Main {
	public static void main(String[] args) {
		Stack s = new Stack(10);
		
			//int num = sc.nextInt();			
			s.pushToStack(10);
			s.pushToStack(20);
			s.pushToStack(30);
			s.pushToStack(15);
			
			s.printStack();
			System.out.println("Popped Ele= " + s.pop());
			System.out.println("Popped Ele= " + s.pop());			
			s.printStack();
		
	}
}
