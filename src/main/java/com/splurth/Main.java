package com.splurth;

/**
 * Created by BKuczynski on 2016-08-08.
 */
public class Main {

    public static void main(String[] args) {
        ChemicalElement chemicalElement = new ChemicalElement(args[0], args[1]);
        ElementSymbolChecker symbolChecker = new ElementSymbolChecker();
        ValidSymbolCounter symbolCounter = new ValidSymbolCounter();
        FirstByAlphabetSymbolFinder symbolFinder= new FirstByAlphabetSymbolFinder();

        System.out.println("Is symbol valid? " + symbolChecker.validate(chemicalElement));
        System.out.println("Number of valid symbols: " + symbolCounter.countValidSymbols(chemicalElement));
        System.out.println("First valid symbol by alphabetical order: " + symbolFinder.findFirstValidByAlphabet(chemicalElement));
    }
}
