package com.infogain.generics.dto;

public interface Movable extends Transportable{
default void move(){
	System.out.println("i move very fast just like vrooooooom");
}
}
