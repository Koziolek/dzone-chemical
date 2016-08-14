package com.splurth;

/**
 * Created by BKuczynski on 2016-08-08.
 */
public class ChemicalElement {

	private final String name;

	private final Symbol symbol;

	public ChemicalElement(String name, String symbol) {
		if (name.matches("[^a-zA-Z]*") || symbol.matches("[^a-zA-Z]*"))
			throw new IllegalArgumentException("Invalid char in name or symbol");
		this.name = name;
		this.symbol = new Symbol(symbol);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ChemicalElement{" +
				"name='" + name + '\'' +
				", symbol=" + symbol +
				'}';
	}

	public Symbol getSymbol() {
		return symbol;
	}
}
