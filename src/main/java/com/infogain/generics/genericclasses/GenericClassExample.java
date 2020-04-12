package com.infogain.generics.genericclasses;

public class GenericClassExample {
	public static void main(String[] args) {
		Container<Object> container = new Container<>();
		container.setContents(new Object());
		container.setContents(Integer.valueOf(1));// Can be done as Integer is a child of Object
		Object o = container.getContents();
		System.out.println("Value of o is " + o);
		System.out.println(container);
		// container= new Container<Integer>(); Type mismatch: cannot convert from
		// Container<Integer> to Container<Object>
		Container<Integer> intContainer = new Container<Integer>();// Specifying type in Instantiation is optional
		intContainer.setContents(Integer.valueOf(22));
		// intContainer.setContents(new Object()); Cant be done as Object is not child
		// of Integer
		Integer i = intContainer.getContents();
		System.out.println("Value od i is " + i);
		System.out.println(intContainer);
		Container<Double> doubleContainer = new Container<>();// We can just use the <> operator
		doubleContainer.setContents(Double.valueOf(22));
		Double d = doubleContainer.getContents();
		System.out.println("Value od d is " + d);
		System.out.println(doubleContainer);

	}
}

class Container<T> {
	T contents;

	/**
	 * @return the contents
	 */
	public T getContents() {
		return contents;
	}

	/**
	 * @param contents the contents to set
	 */
	public void setContents(T contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "Container [contents=" + contents.toString() + "]";
	}

}