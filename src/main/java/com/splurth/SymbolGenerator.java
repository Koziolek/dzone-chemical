package com.splurth;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.splurth.ListExtension.head;
import static com.splurth.ListExtension.tail;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.stream.Stream.concat;

/**
 * Created by BKuczynski on 2016-08-08.
 */
class SymbolGenerator {

    private Map<ChemicalElement, Collection<Symbol>> cache = Collections.synchronizedMap(new WeakHashMap<>());

    public Collection<Symbol> generateDistinctValidSymbols(ChemicalElement element) {
        return cache.computeIfAbsent(element, e -> getSymbolStream(e).distinct().collect(Collectors.toList()));
    }

    private Stream<Symbol> getSymbolStream(ChemicalElement element) {
        return generateStream(asList(element.getName().toLowerCase().split("")));
    }

    private Stream<Symbol> generateStream(List<String> chars) {
        String head = head(chars);
        List<String> tail = tail(chars);

        Function<String, Symbol> mapper = ((Function<String, String>) s -> head + s).andThen(Symbol::new);

        if (tail.size() == 1) {
            return tail.stream().map(mapper);
        }

        return concat(
                tail.stream().map(mapper),
                generateStream(tail)
        );
    }
}

class ListExtension {

    static <T> T head(List<T> list) {
        return list.get(0);
    }

    static <T> List<T> tail(List<T> list) {
        if (list.size() == 0) return emptyList();
        return list.subList(1, list.size());
    }
}