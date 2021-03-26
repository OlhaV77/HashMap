import java.util.Arrays;

public class LetterCountWithMap {

    public static void main(String[] args) {
        countLetters("abcb");
        countLetters("abc");
    }
    // "a": 1  ... "bcb"
    // remove "a" from "abcb"

    // "b": 1 ... "cb"
    // "b": 2 ... "cb"
    // remove "b" ... "c"

    // "c": 1 ... "" - end

    static LetterSummary[] countLetters(String letter) {
        LetterSummary[] result = new LetterSummary[letter.length()];
        if (letter.length() == 0) {
            return result;
        }

        int length = letter.length();

        // "abca"

        for(int i = 0; i < length; i++) {
            String singleLetter = letter.substring(0, 1);

            LetterSummary letterSummary = new LetterSummary();
            letterSummary.letter = singleLetter;
            letterSummary.count = 1;
            result[i] = letterSummary;
            if (letter.length() == 1) {
                return result;
            }

            letter = letter.substring(1);
        }

        return result;
    }


}


/*

    Given a string, count how many times each letter occurs.

        countLetters(“abcb”) => [{a: 1}, {b: 2}, {c: 1}]

        Starting point for method:

        LetterSummary[] countLetters(String letters) {
        LetterSummary results [] = // implement me

        // implement me

        return results;
        }

        LetterSummary class:

        {
            String letter;
            int count;
        }


        Note: you are not allowed to use Map.

 */