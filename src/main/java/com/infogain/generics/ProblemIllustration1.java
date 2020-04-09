package com.infogain.generics;

public class ProblemIllustration1 {

	public static void main(String[] args) {
		Store store = new Store();
		store.setItem(112);
		Integer item =(Integer)store.getItem();
		System.out.println(store);
		store.setItem("Rudhra");
		String stringItem=(String)store.getItem();
		System.out.println(store);
		System.out.println(Math.abs((Integer)store.getItem()));//Exception
	}
}
class Store{
	private Object item;
	public Object getItem() {
		return item;
	}
	public void setItem(Object item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return this.item.toString();
	}
}
