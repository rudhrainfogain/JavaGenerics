package com.infogain.generics;

public class MultipleTypeParametersExample {
	
public static void main(String[] args) {
	HashTable<String,Integer> table= new HashTable<>("Hello",55);
	System.out.println(table);
}
}
class HashTable<K,V>{
	private K key;
	private V value;
	public HashTable(K key, V value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		return "key : "+key.toString()+" - value : "+value.toString();
	}
	
}
