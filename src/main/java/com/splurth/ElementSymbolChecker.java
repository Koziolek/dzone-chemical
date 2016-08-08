package com.splurth;

/**
 * Created by BKuczynski on 2016-08-08.
 */
public class ElementSymbolChecker {

	private SymbolGenerator symbolGenerator = new SymbolGenerator();

	public boolean validate(ChemicalElement element) {
		return symbolGenerator.generateDistinctValidSymbols(element).contains(element.getSymbol());
	}
}
