package codewars;

import java.util.HashMap;
import java.util.stream.Collectors;

public class DnaStrand {
    /*public static String makeComplement(String dna) {
        char[] dnaChars = dna.toCharArray();
        for (int index = 0; index < dna.length(); index++) {
            if (dna.charAt(index) == 'A') {
                dnaChars[index] = 'T';
            } else if (dna.charAt(index) == 'T') {
                dnaChars[index] = 'A';
            }else if (dna.charAt(index) == 'C') {
                dnaChars[index] = 'G';
            }else if (dna.charAt(index) == 'G') {
                dnaChars[index] = 'C';
            }
        }
        dna = String.valueOf(dnaChars);
        return dna;
    }*/

    /*public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();

        StringBuilder builder = new StringBuilder();
        for (char c : chars){
            switch (c){
                case 'A': {builder.append("T"); break;}
                case 'T': {builder.append("A"); break;}
                case 'C': {builder.append("G"); break;}
                case 'G': {builder.append("C"); break;}
            }
        }

        return builder.toString();
    }*/

    private static HashMap<Character, Character> map = new HashMap<>(4);
    static {
        map.put('A', 'T');
        map.put('T', 'A');
        map.put('C', 'G');
        map.put('G', 'C');}
    public static String makeComplement(String dna) {
        return dna
                .chars()
                .mapToObj(c -> String.valueOf(map.get((char)c)))
                .collect(Collectors.joining());
    }
}
