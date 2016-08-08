package com.splurth;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by BKuczynski on 2016-08-08.
 */
class SymbolGenerator {

	public Collection<Symbol> generateAllValidSymbols(ChemicalElement element) {
		return getSymbolStrings(element).collect(Collectors.toList());
	}

	public Collection<Symbol> generateDistinctValidSymbols(ChemicalElement element) {
		return getSymbolStrings(element).distinct().collect(Collectors.toList());
	}

	private Stream<Symbol> getSymbolStrings(ChemicalElement element) {
		String name = element.getName().toLowerCase();
		List<String> validSymbols = new LinkedList<>();
		char[] chars = name.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				validSymbols.add(chars[i] + "" + chars[j]);
			}
		}
		return validSymbols.stream().map(Symbol::new);
	}
}
