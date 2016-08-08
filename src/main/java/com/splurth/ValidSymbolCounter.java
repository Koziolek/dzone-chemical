package com.splurth;

/**
 * Created by BKuczynski on 2016-08-08.
 */
public class ValidSymbolCounter {

    private SymbolGenerator symbolGenerator = new SymbolGenerator();

    public int countValidSymbols(ChemicalElement element) {
        return symbolGenerator.generateDistinctValidSymbols(element).size();
    }
}
