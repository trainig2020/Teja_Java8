package com.ezhil;
public class MethodReference {
	
	public static void main(String[] args) {
		
		
		
		 // Thread t = new Thread(() -> printMessage());
		 
		Thread t = new Thread(MethodReference::printMessage); // () -> method()
		//MethodReferenceExample1::printMessage === () -> printMessage()
		 t.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}