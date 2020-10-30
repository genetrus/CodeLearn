package crypto;

public class CryptarithmeticPuzzle {
    public static int T = 9;
    public static int O = 9;
    public static int G = 9;
    public static int D = 9;
    public static int TOGD = 9999;
    public static int isogramLetters = TOGD;

    // TOO + TOO + TOO + TOO = GOOD
    public int[] calc() {

        while (TOGD >= 0 && !isWordsEquals(buildUpWords(appointLetters(TOGD)))) {
            TOGD--;
        }
        return appointLetters(TOGD);
    }

    public static int[] appointLetters(int isogramL) {
        int[] letters = new int[sizeLetters(isogramLetters)];
        for (int i = 0; isogramL != 0; i++) {
            letters[i] = isogramL % 10;
            isogramL = isogramL / 10;
        }
        return letters;
    }

    public static int sizeLetters(int isogram) {
        int count = 0;
        while (isogram != 0) {
            isogram = isogram / 10;
            count++;
        }
        return count;
    }

    public static int[] buildUpWords(int[] letters) {
        T = letters[0];
        O = letters[1];
        G = letters[2];
        D = letters[3];
        int TOO;
        int GOOD;
        TOO = T * 100 + O * 10 + O;
        GOOD = G * 1000 + O * 100 + O * 10 + D;
        return new int[] {TOO, GOOD};
    }

    public static boolean isWordsEquals(int[] words) {
        for (int i = 1; i < words.length; i++) {
            if (words[i - 1] * 4 == words[i])
            return true;
        }
        return false;
    }
}
