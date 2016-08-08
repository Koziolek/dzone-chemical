package com.splurth;

import java.util.function.Predicate;

/**
 * Created by BKuczynski on 2016-08-08.
 */
public class ElementSymbolChecker {

    public boolean validate(ChemicalElement element) {
        Symbol symbol = element.getSymbol();
        String elementName = element.getName().toLowerCase();

        String regExp = ".*" + symbol.getFirst().toLowerCase() + ".*" + symbol.getSecond().toLowerCase() + ".*";

        Predicate<Symbol> symbolLength = s -> s.getSymbol().length() == 2;
        Predicate<Symbol> firstLetter = s -> elementName.contains(s.getFirst().toLowerCase());
        Predicate<Symbol> secondLetter = s -> elementName.contains(s.getSecond().toLowerCase());
        Predicate<Symbol> letterOrder = s -> elementName.matches(regExp);


        return symbolLength.and(firstLetter).and(secondLetter).and(letterOrder).test(symbol);
    }
}
