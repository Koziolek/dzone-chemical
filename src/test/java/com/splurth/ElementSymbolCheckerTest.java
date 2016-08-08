package com.splurth;

import org.fest.assertions.Assertions;
import org.junit.Test;

/**
 * Example data from article
 * <p>
 * Spenglerium, Ee -> true
 * Zeddemorium, Zr -> true
 * Venkmine, Kn -> true
 * Stantzon, Zt -> false
 * Melintzum, Nn -> false
 * Tullium, Ty -> false
 * <p>
 * <p>
 * Created by BKuczynski on 2016-08-08.
 */
public class ElementSymbolCheckerTest {


    private ElementSymbolChecker sut = new ElementSymbolChecker();

    @Test
    public void shouldElementBeValid() {
        Assertions.assertThat(sut.validate(new ChemicalElement("Spenglerium", "Ee"))).isTrue();
        Assertions.assertThat(sut.validate(new ChemicalElement("Zeddemorium", "Zr"))).isTrue();
        Assertions.assertThat(sut.validate(new ChemicalElement("Venkmine", "Kn"))).isTrue();
    }

    @Test
    public void shouldElementBeInvalid() {
        Assertions.assertThat(sut.validate(new ChemicalElement("Tullium", "Ty"))).isFalse();
        Assertions.assertThat(sut.validate(new ChemicalElement("Stantzon", "Zt"))).isFalse();
        Assertions.assertThat(sut.validate(new ChemicalElement("Melintzum", "Nn"))).isFalse();
    }

}