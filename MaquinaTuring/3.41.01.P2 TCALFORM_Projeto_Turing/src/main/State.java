package main;

public class State {
	
	private String label;
	char  value;
	private int direction;
	
	public State(String string, char value, int direction) {

		this.label = string;
		this.value = value;
		this.direction = direction;
	}
	
	public State(String string, char value) {
		this.label = string;
		this.value = value;
	}
	
	public char getValue() {
		return value;
	}
	
	public String getLabel() {
		return label;
	}
	
	public int getDirection() {
		return direction;
	}
}
