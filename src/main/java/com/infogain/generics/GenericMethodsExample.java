package com.infogain.generics;

public class GenericMethodsExample<F> {

	public <T> T showItem(T item) {
		System.out.print("Received Item  " + item.toString());
		return item;
	}
	public F showThing(F thing) {
		System.out.print("Received thing  " + thing.toString());
		return thing;
	}
	public <G, T> F showitemAndassetAndReturnThing(T item, F thing, G asset) {
		System.out.println("Received item " + item + " Received Asset " + asset);
		return thing;
	}
	public static void main(String[] args) {
		GenericMethodsExample example = new GenericMethodsExample<>();
		System.out.println(" Returned item : " + example.showItem(22));
		System.out.println(" Returned item : " + example.showItem(44.50));
		System.out.println(" Returned item : " + example.showItem("hello"));
		System.out.println(" Returned item : " + example.showItem(44l));
		System.out.println(" Returned item : " + example.showItem(55f));
		System.out.println("-----------------------------------------------");
		GenericMethodsExample<String> example1 = new GenericMethodsExample<>();
		System.out.println(" Returned thing : " + example1.showThing("hello"));
		// CT Error System.out.println(" Returned item : " + example1.showThing(44l));
		System.out.println(" Returned item : " + example1.showItem(55f));
		System.out.println(" Returned thing : " +
		example1.showitemAndassetAndReturnThing(66l,"heya","woopsy"));
	}
}
