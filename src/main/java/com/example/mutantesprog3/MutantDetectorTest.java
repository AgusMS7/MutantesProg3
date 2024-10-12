package com.example.mutantesprog3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; // Asegúrate de importar correctamente las aserciones

public class MutantDetectorTest {

    @Test
    public void testIsMutantWithMutantDna() {
        String[] mutantDna = {
                "ATGCGA",
                "CAGTGC",
                "TTATGT",
                "AGAAGG",
                "CCCCTA",
                "TCACTG"
        };
        assertTrue(MutantDetector.isMutant(mutantDna));
    }

    @Test
    public void testIsMutantWithNonMutantDna() {
        String[] nonMutantDna = {
                "ATGCGA",
                "CAGTGC",
                "TTATTT",
                "AGACGG",
                "GCGTCA",
                "TCACTG"
        };
        assertFalse(MutantDetector.isMutant(nonMutantDna));
    }

    @Test
    public void testIsMutantWithEmptyDna() {
        String[] emptyDna = {};
        assertFalse(MutantDetector.isMutant(emptyDna));
    }

    @Test
    public void testIsMutantWithShortDna() {
        String[] shortDna = {
                "ATG",
                "CAG",
                "TTT"
        };
        assertFalse(MutantDetector.isMutant(shortDna));
    }
}
