package com.splurth;

import org.junit.Test;

import java.util.Collection;

import static org.fest.assertions.Assertions.assertThat;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public class SymbolGeneratorTest {

	private SymbolGenerator sut = new SymbolGenerator();

	@Test
	public void shouldSymbolGeneratorCreateListOf() throws Exception {
		Collection<Symbol> symbols = sut.generateDistinctValidSymbols(new ChemicalElement("Anna", "An"));

		assertThat(symbols)
				.hasSize(4)
				.contains(
						new Symbol("Aa"),
						new Symbol("An"),
						new Symbol("Na"),
						new Symbol("Nn")
				);

	}
}