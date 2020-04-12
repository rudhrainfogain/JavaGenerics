package com.infogain.generics.genericmethods;

public class GenericMethodsExample1 {

}

class Test<T> {
	public String getMessages(int count) {
		return count + "messages";
	}
}

class Test1<T> {
	/*
	 * Use of Generic Type parameter Declared at Class level as a Type for Instance
	 * variable
	 * 
	 */
	T value;

	/**
	 * Use of Generic Type parameter Declared at Class level as a Constructor
	 * argument
	 * 
	 * @param value
	 */
	public Test1(T value) {
		this.value = value;
	}

	/**
	 * Use of Generic Type parameter Declared at Class level as a return type for a
	 * method
	 * 
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * Use of Generic Type parameter Declared at Class level as a method argument
	 * 
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}

}

class Test2 {

	/**
	 * Use of Generic Type parameter Declared at Method level as a Constructor
	 * argument
	 * 
	 * @param value
	 */
	public <T> Test2(T value) {
		System.out.println();
	}

	/**
	 * Use of Generic Type parameter Declared at Method level as a return type and
	 * parameter for a method
	 * 
	 * @return the value
	 */
	public <T> T getValue(T value) {
		return value;
	}

	/**
	 * Use of Generic Type parameter Declared at method level as a method argument
	 * 
	 * @param value the value to set
	 */
	public <T> void printValue(T value) {
		System.out.println(value.toString());
	}

}

class Test3<T, U> {
	/*
	 * Use of Generic Type parameter Declared at Class level as a Type for Instance
	 * variable
	 * 
	 */
	T value;
	U key;

	/**
	 * Use of Generic Type parameter Declared at Class level as a Constructor
	 * argument
	 * 
	 * @param value
	 */
	public Test3(T value) {
		this.value = value;
	}

	/**
	 * Use of Generic Type parameter Declared at Class level as a Constructor
	 * argument
	 * 
	 * @param value
	 */
	public Test3(T value, U key) {
		this.value = value;
		this.key = key;
	}

	/**
	 * Use of Generic Type parameter Declared at Class level as a return type for a
	 * method
	 * 
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * Use of Generic Type parameter Declared at Class level as a method argument
	 * 
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * Use of Generic Type parameter Declared at Class level as a method argument
	 * and return type
	 * 
	 * @param value
	 * @param key
	 * @return
	 */
	public T returnKeyAndPrintValue(T value, U key) {
		System.out.println(key);
		return value;

	}

}

class Test4 {

	/**
	 * Use of Generic Type parameter Declared at Method level as a Constructor
	 * argument
	 * 
	 * @param value
	 */
	public <T, U> Test4(U key, T value) {
		System.out.println("Key is  : " + key + " value is : " + value);
	}

	/**
	 * Use of Generic Type parameter Declared at Method level as a return type and
	 * parameter for a method
	 * 
	 * @return the value
	 */
	public <T> T getValue(T value) {
		return value;
	}

	/**
	 * Use of Generic Type parameter Declared at method level as a method argument
	 * 
	 * @param value the value to set
	 */
	public <T> void printValue(T value) {
		System.out.println(value.toString());
	}

	/**
	 * Use of Generic Type parameter Declared at method level as a method argument
	 * and return type
	 * 
	 * @param value
	 * @param key
	 * @return
	 */
	public <T, U> T returnKeyAndPrintValue(T value, U key) {
		System.out.println(key);
		return value;

	}

	class Test5<T> {

		/**
		 * Use of Generic Type parameter Declared at Method level as a Constructor
		 * argument
		 * 
		 * @param value
		 */
		public <U> Test5(U key, T value) {
			System.out.println("Key is  : " + key + " value is : " + value);
		}

		/**
		 * Use of Generic Type parameter Declared at class level as a return type and
		 * parameter for a method
		 * 
		 * @return the value
		 */
		public T getValue(T value) {
			return value;
		}

		/**
		 * Use of Generic Type parameter Declared at method level as a method argument
		 * 
		 * @param value the value to set
		 */
		public <U> void printValue(U value) {
			System.out.println(value.toString());
		}

		/**
		 * Use of Generic Type parameter Declared at class level as a method argument
		 * and return type and Use of Generic Type parameter Declared at method level as
		 * a method argument
		 * 
		 * @param value
		 * @param key
		 * @return
		 */
		public <U> T returnKeyAndPrintValue(T value, U key) {
			System.out.println(key);
			return value;

		}

	}
}
