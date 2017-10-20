package main;

public class Direction {

	private String label;
	private int value;

	public Direction(String string) {
		this.label = string;
		setValue(string);
	}

	private void setValue(String string) {
		if (string.equals("R") || string.equals(">") || string.equals("D")) {
			value = 1;
		} else if (string.equals("L") || string.equals("<") || string.equals("E")) {
			value = -1;
		} else {
			System.out.println("CARACTER DE DIRECAO INVALIDO");
			System.exit(0);
		}
	}
}
