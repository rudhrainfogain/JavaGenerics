package com.infogain.generics;

public class GenericSolutionProblemIllustration1 {
	public static void main(String[] args) {
		GenericStore<Integer> store = new GenericStore();
		store.setItem(112);
		Integer item =store.getItem();
		System.out.println(store);
		GenericStore<String> store1 = new GenericStore();
		store1.setItem("Rudhra");
		String stringItem=store1.getItem();
		System.out.println(store1);
		System.out.println(Math.abs(store.getItem()));
//System.out.println(Math.abs((Integer)store1.getItem()));// Compiletime Exception
	}
}
class GenericStore<T>{
	private T item;
	public T getItem() {return item;}
	public void setItem(T item) {this.item = item;}
	@Override
	public String toString() {
		return this.item.toString();
	}
}
