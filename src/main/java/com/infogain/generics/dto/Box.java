package com.infogain.generics.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Box<T> {
	T object;

	List<T> boxes = new ArrayList<>();

	/**
	 * @return the object
	 */
	public void add(T value) {
		boxes.add(value);
	}

	public T getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(T object) {
		this.object = object;
	}

	/**
	 * @return the boxes
	 */
	public List<T> getBoxes() {
		return boxes;
	}

	/**
	 * @param boxes the boxes to set
	 */
	public void setBoxes(List<T> boxes) {
		this.boxes = boxes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(boxes, object);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Box)) {
			return false;
		}
		Box other = (Box) obj;
		return Objects.equals(boxes, other.boxes) && Objects.equals(object, other.object);
	}

	@Override
	public String toString() {
		return "Box [object=" + object + ", boxes=" + boxes + "]";
	}

}
