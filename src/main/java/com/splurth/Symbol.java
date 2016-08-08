package com.splurth;

/**
 * Created by BKuczynski on 2016-08-08.
 */
public class Symbol {

    private final String symbol;
    private final String first;
    private final String second;

    public Symbol(String symbol) {
        this.first = symbol.substring(0, 1);
        this.second = symbol.substring(1);
        this.symbol = first.toUpperCase() + second.toLowerCase();
    }

    public String getSymbol() {
        return symbol;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "symbol='" + symbol + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Symbol symbol1 = (Symbol) o;

        return getSymbol() != null ? getSymbol().equals(symbol1.getSymbol()) : symbol1.getSymbol() == null;

    }

    @Override
    public int hashCode() {
        return getSymbol() != null ? getSymbol().hashCode() : 0;
    }
}
