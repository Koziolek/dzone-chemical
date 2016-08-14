package com.splurth;

import org.junit.Test;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */

public class ChemicalElementTest {

	@Test(expected = IllegalArgumentException.class)
	public void shouldConstructorThrowsOnInvalidCharInName() throws Exception {
		new ChemicalElement("123", "Aa");
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldConstructorThrowsOnInvalidCharIUnSymbol() throws Exception {
		new ChemicalElement("Abba", "12");
	}
}