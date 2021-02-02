package com.demo.generics;

public class GenericsClass<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	@Override
	public String toString() {
		return "GenericsType [t=" + t + "]";
	}

	public static void main(String args[]){
		GenericsClass<String> type = new GenericsClass<>();
		type.set("Pankaj"); 
		System.out.println("1"+type);
		
		GenericsClass type1 = new GenericsClass();
		type1.set("Pankaj"); 
		System.out.println("2"+type1);
		type1.set(10); 
		System.out.println("3"+type1);
	}
}
