package com.splurth;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by BKuczynski on 2016-08-08.
 */
public class FirstByAlphabetSymbolFinderTest {

    private FirstByAlphabetSymbolFinder sut = new FirstByAlphabetSymbolFinder();


    @Test
    public void shouldFindFirst() throws Exception {
        assertThat(sut.findFirstValidByAlphabet(new ChemicalElement("Gozerium", "Go"))).isEqualTo(new Symbol("Ei"));
        assertThat(sut.findFirstValidByAlphabet(new ChemicalElement("Slimyrine", "Sl"))).isEqualTo(new Symbol("Ie"));
    }
}