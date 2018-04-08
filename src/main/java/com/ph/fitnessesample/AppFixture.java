package com.ph.fitnessesample;

public class AppFixture {
	private App app = new App();
	private String text;
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String toUpperCase() {
		try {
			return app.toUpperCase(this.text);
		} catch (IllegalArgumentException e) {
			// workaround ?!
			return "java.lang.IllegalArgumentException<<" + e.getMessage() + ">>";
		}
	}	
}
