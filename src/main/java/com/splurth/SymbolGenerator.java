package com.splurth;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

/**
 * Created by BKuczynski on 2016-08-08.
 */
class SymbolGenerator {

	public Collection<Symbol> generateAllValidSymbols(ChemicalElement element) {
		return getSymbolStream(element).collect(Collectors.toList());
	}

	public Collection<Symbol> generateDistinctValidSymbols(ChemicalElement element) {
		return getSymbolStream(element).distinct().collect(Collectors.toList());
	}

	private Stream<Symbol> getSymbolStream(ChemicalElement element) {
		String name = element.getName().toLowerCase();
		List<String> chars = Arrays.asList(name.split(""));

		return generateStream(chars);
	}

	private Stream<Symbol> generateStream(List<String> chars) {
		String head = head(chars);
		List<String> tail = tail(chars);

		Function<String, String> headTailConcat = s -> head + s;

		if (tail.size() == 1)
			return tail.stream().map(s -> head + s).map(Symbol::new);


		return concat(
				tail.stream().map(headTailConcat).map(Symbol::new),
				generateStream(tail)
		);
	}


	private <T> T head(List<T> list) {
		return list.get(0);
	}

	private <T> List<T> tail(List<T> list) {
		if (list.size() == 0) return Collections.emptyList();
		return list.subList(1, list.size());
	}
}
