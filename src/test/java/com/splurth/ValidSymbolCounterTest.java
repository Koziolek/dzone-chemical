package com.splurth;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by BKuczynski on 2016-08-08.
 */
public class ValidSymbolCounterTest {

    private ValidSymbolCounter sut = new ValidSymbolCounter();

    @Test
    public void shouldCountTo11() throws Exception {
        assertThat(sut.countValidSymbols(new ChemicalElement("Zuulon", "Zu"))).isEqualTo(11);
        assertThat(sut.countValidSymbols(new ChemicalElement("Aaa", "Aa"))).isEqualTo(1);
    }
}