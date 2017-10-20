package main;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class MaquinaTuring {
	public static Table<String, Character, State> transactions = HashBasedTable.create();

	String estadoAtual;
	int leitura, cabecote;
	State finalState;

	public void checkSequence(char[] chars) {

		int i = 1;

		finalState = new State("qo", ' ');

		while (!finalState.getLabel().equals("qfim")) {

			finalState = transactions.get(finalState.getLabel(), chars[i]);
			chars[i] = finalState.getValue();
			i += finalState.getDirection();

			switch (i) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			default:
				break;

			}

		}
	}

	public void setTransactions() {

		transactions.put("q0", '0', new State("q0", '0', 1));
		transactions.put("q0", '1', new State("q0", '1', 1));
		transactions.put("q0", '2', new State("q0", '2', 1));
		transactions.put("q0", '3', new State("q0", '3', 1));
		transactions.put("q0", '4', new State("q0", '4', 1));
		transactions.put("q0", '5', new State("q0", '5', 1));
		transactions.put("q0", '6', new State("q0", '6', 1));
		transactions.put("q0", '7', new State("q0", '7', 1));
		transactions.put("q0", '8', new State("q0", '8', 1));
		transactions.put("q0", '9', new State("q0", '9', 1));

		transactions.put("q0", ' ', new State("metade", '0', -1));

		transactions.put("metade", '0', new State("metade", '0', -1));
		transactions.put("metade", '2', new State("metade", '1', -1));
		transactions.put("metade", '4', new State("metade", '2', -1));
		transactions.put("metade", '6', new State("metade", '3', -1));
		transactions.put("metade", '8', new State("metade", '4', -1));

		transactions.put("metade", '1', new State("addMeio", '0', 1));
		transactions.put("metade", '3', new State("addMeio", '1', 1));
		transactions.put("metade", '5', new State("addMeio", '2', 1));
		transactions.put("metade", '7', new State("addMeio", '3', 1));
		transactions.put("metade", '9', new State("addMeio", '4', 1));

		transactions.put("addMeio", '0', new State("jump", '5', -1));
		transactions.put("addMeio", '1', new State("jump", '6', -1));
		transactions.put("addMeio", '2', new State("jump", '7', -1));
		transactions.put("addMeio", '3', new State("jump", '8', -1));
		transactions.put("addMeio", '4', new State("jump", '9', -1));

		transactions.put("jump", '0', new State("metade", '0', -1));
		transactions.put("jump", '1', new State("metade", '1', -1));
		transactions.put("jump", '2', new State("metade", '2', -1));
		transactions.put("jump", '3', new State("metade", '3', -1));
		transactions.put("jump", '4', new State("metade", '4', -1));

		transactions.put("metade", ' ', new State("removeZero", ' ', 1));

		transactions.put("removeZero", '0', new State("removeZero", ' ', 1));

		// Fim
		transactions.put("removeZero", ' ', new State("qFim", ' ', 1));

		transactions.put("removeZero", '1', new State("voltar", '1', 1));
		transactions.put("removeZero", '2', new State("voltar", '2', 1));
		transactions.put("removeZero", '3', new State("voltar", '3', 1));
		transactions.put("removeZero", '4', new State("voltar", '4', 1));
		transactions.put("removeZero", '5', new State("voltar", '5', 1));
		transactions.put("removeZero", '6', new State("voltar", '6', 1));
		transactions.put("removeZero", '7', new State("voltar", '7', 1));
		transactions.put("removeZero", '8', new State("voltar", '8', 1));
		transactions.put("removeZero", '9', new State("voltar", '9', 1));

		transactions.put("voltar", '0', new State("voltar", '0', 1));
		transactions.put("voltar", '1', new State("voltar", '1', 1));
		transactions.put("voltar", '2', new State("voltar", '2', 1));
		transactions.put("voltar", '3', new State("voltar", '3', 1));
		transactions.put("voltar", '4', new State("voltar", '4', 1));
		transactions.put("voltar", '5', new State("voltar", '5', 1));
		transactions.put("voltar", '6', new State("voltar", '6', 1));
		transactions.put("voltar", '7', new State("voltar", '7', 1));
		transactions.put("voltar", '8', new State("voltar", '8', 1));
		transactions.put("voltar", '9', new State("voltar", '9', 1));

		transactions.put("voltar", ' ', new State("resto", '0', -1));

		transactions.put("resto", '0', new State("restoZero", ' ', 1));
		transactions.put("restoZero", ' ', new State("setRestoZero", ' ', 1));
		transactions.put("setRestoZero", '0', new State("setRestoZero", '0', 1));
		transactions.put("setRestoZero", '1', new State("setRestoZero", '1', 1));

		transactions.put("resto", '1', new State("restoHum", ' ', 1));
		transactions.put("restoHum", ' ', new State("setRestoZero", ' ', 1));
		transactions.put("setRestoHum", '0', new State("setRestoZero", '0', 1));
		transactions.put("setRestoHum", '1', new State("setRestoZero", '1', 1));

		transactions.put("setRestoZero", ' ', new State("continuar", '0', -1));
		transactions.put("setRestoHum", ' ', new State("continuar", '1', -1));

		transactions.put("continuar", ' ', new State("continuarDois", ' ', -1));

		transactions.put("continuarDois", ' ', new State("metade", '0', -1));

	}
}
