package com.infogain.generics.dto;

public interface Transportable {
default void transport() {
	System.out.println("I am a means of transport!!!!!!!!!!!!!!!");
}
}
