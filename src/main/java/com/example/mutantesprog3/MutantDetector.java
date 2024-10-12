package com.example.mutantesprog3;
public class MutantDetector {
    private static final int MIN_SEQUENCE_LENGTH = 4;
    private static final char[] BASES = {'A', 'T', 'C', 'G'};

    public static boolean isMutant(String[] dna) {
        int n = dna.length;
        int count = 0;

        // Check rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - MIN_SEQUENCE_LENGTH; j++) {
                if (checkSequence(dna[i].substring(j, j + MIN_SEQUENCE_LENGTH))) {
                    count++;
                }
            }
        }

        // Check columns
        for (int i = 0; i <= n - MIN_SEQUENCE_LENGTH; i++) {
            for (int j = 0; j < n; j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < MIN_SEQUENCE_LENGTH; k++) {
                    sb.append(dna[i + k].charAt(j));
                }
                if (checkSequence(sb.toString())) {
                    count++;
                }
            }
        }

        // Check diagonals
        for (int i = 0; i <= n - MIN_SEQUENCE_LENGTH; i++) {
            for (int j = 0; j <= n - MIN_SEQUENCE_LENGTH; j++) {
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (int k = 0; k < MIN_SEQUENCE_LENGTH; k++) {
                    sb1.append(dna[i + k].charAt(j + k));
                    sb2.append(dna[i + k].charAt(j + MIN_SEQUENCE_LENGTH - 1 - k));
                }
                if (checkSequence(sb1.toString()) || checkSequence(sb2.toString())) {
                    count++;
                }
            }
        }

        return count > 1;
    }

    private static boolean checkSequence(String sequence) {
        for (char base : BASES) {
            if (sequence.equals(new String(new char[MIN_SEQUENCE_LENGTH]).replace('\0', base))) {
                return true;
            }
        }
        return false;
    }
}