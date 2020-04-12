package com.infogain.generics;
public class BoundedTypeParametersExample {
public static <T extends Comparable<T>> T calculateMin(T t1,T t2) {
	if(t1.compareTo(t2)<0){	return t1;}
	return t2;
}
public static void main(String[] args) {
	System.out.println("Min of 11,43 is :"+calculateMin(11, 43));
	System.out.println("Min of Rudhra,koul is :"+calculateMin("Rudhra", "koul"));
	System.out.println("Min of p1,p2 is :"+
	calculateMin(new Person("Rudhra"),new Person("Koul")));
	/*Below code gives compile time error as Student is not Comparable
	 * System.out.println("Min of s1,s2 is :"+ calculateMin(new
	 * Student("Rudhra"),new Student("Koul")));
	 */
}
}
class Person implements Comparable<Person>{
	String personName;
	public Person(String personName) {
		this.personName = personName;	}
	@Override
	public int compareTo(Person o) {
		return this.personName.compareTo(o.personName);	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + "]";}
}
class Student{
String studentName;
	public Student(String studentName) {
		this.studentName = studentName;	}
}
