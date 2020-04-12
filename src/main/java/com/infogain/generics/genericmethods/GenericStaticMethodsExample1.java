package com.infogain.generics.genericmethods;

public class GenericStaticMethodsExample1 {

	public static void main(String[] args) {
		String message = Test11.getMessages(1, "heya");// Compiler Guesses type by Type inference
		String message1 = Test11.<String>getMessages(1, "heya");// Specifying Type using Type witness
		Integer message2 = Test11.<Integer>getMessages(1, 33);// Specifying Type using Type witness
		System.out.println(message);
		System.out.println(message1);
		System.out.println(message2);
		System.out.println(Test11.isEqual("heya", Integer.valueOf(22)));
		System.out.println(Test11.<String, Integer>isEqual("heya", Integer.valueOf(22)));// Specifying Type using Type
																							// witness for method level
																							// Type parameters
		System.out.println(Test12.isEqual("heya", Integer.valueOf(22)));
		System.out.println(Test12.<String, Integer>isEqual("heya", Integer.valueOf(22)));// Specifying Type using Type
																							// witness for method level
																							// Type parameters
		System.out.println(Test12.<String, String>isEqual("heya", "heya"));// Specifying Type using Type witness for
																			// method level Type parameters

	}

}

class Test11<K> {
	public static <T> T getMessages(int count, T message) {
		System.out.println("message count is  " + count);
		return message;
	}

	public static <K, V> boolean isEqual(K key, V key2) {
		return key.equals(key2);
	}

}

class Test12 {
	public static <K, V> boolean isEqual(K key, V key2) {
		return key.equals(key2);
	}
}
