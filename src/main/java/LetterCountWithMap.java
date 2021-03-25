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

        LetterSummary letterSummary = new LetterSummary();
        String oneLetter = letter.substring(0, 1);
        letterSummary.letter = oneLetter;
        letterSummary.count = 1;
        result[0] = letterSummary;
        if (letter.length() == 1) {
            return result;
        }

        LetterSummary letterTwoSummary = new LetterSummary();
        String twoLetter = letter.substring(1, 2);
        letterTwoSummary.letter = twoLetter;
        letterTwoSummary.count = 1;
        result[1] = letterTwoSummary;
        if (letter.length() == 2) {
            return result;
        }

        LetterSummary letterThreeSummary = new LetterSummary();
        String threeLetter = letter.substring(2, 3);
        letterThreeSummary.letter = threeLetter;
        letterThreeSummary.count = 1;
        result[2] = letterThreeSummary;
        if (letter.length() == 3) {
            return result;
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