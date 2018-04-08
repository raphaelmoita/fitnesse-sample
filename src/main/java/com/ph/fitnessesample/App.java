package com.ph.fitnessesample;

public class App {

	public String toUpperCase(String text) {
		if (text.matches("[0-9]+")) {
			throw new IllegalArgumentException("Invalid input");
		}
		return text.toUpperCase();
	}
}
