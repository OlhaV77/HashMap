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

        int count = 0;
        LetterSummary letterSummary = new LetterSummary();

        letterSummary.letter = letter;
        letterSummary.count = 1;

        result[0] = letterSummary;


//        for (int i = 0; i < letter.toCharArray().length; i++) {
//
////                count++;
//
//
//            String str = letter.substring(i); // remove
//
//        }

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