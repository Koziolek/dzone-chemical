package com.splurth;

import java.util.Collection;

/**
 * Created by BKuczynski on 2016-08-08.
 */
public class FirstByAlphabetSymbolFinder {

    private SymbolGenerator symbolGenerator = new SymbolGenerator();

    public Symbol findFirstValidByAlphabet(ChemicalElement element) {
        Collection<Symbol> symbols = symbolGenerator.generateDistinctValidSymbols(element);
        return symbols.stream().max((l, r) -> r.getSymbol().compareTo(l.getSymbol())).get();
    }
}
