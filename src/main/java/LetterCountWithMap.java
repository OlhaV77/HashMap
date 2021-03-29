import java.util.Arrays;

public class LetterCountWithMap {

    //  public static void main(String[] args) {
    //     countLetters("abcb");
    //     countLetters("abc");
    //  }
    // "a": 1  ... "bcb"
    // remove "a" from "abcb"

    // "b": 1 ... "cb"
    // "b": 2 ... "cb"
    // remove "b" ... "c"

    // "c": 1 ... "" - end

    static LetterSummary[] countLetters(String letter) {
        LetterSummary[] result = new LetterSummary[letter.length()];          //object array
        if (letter.length() == 0) {                                         // then string empty return result
            return result;
        }

        int length = letter.length();               // length

        for (int i = 0; i < length; i++) {
            String singleLetter = letter.substring(0, 1);             // single letter chooses letter(position(0,1)

            // singleLetter should be checked against existing results
            // if found then increase count
            // if not found then create new letterSummary

            // create a new letterSummary

            for (int j = 0; j < result.length; j++) {                                    // length = 6

                if (singleLetter.equals(result[j])) {                          //result[j].letter = null   , single letter = a
                    result[j].count++;
                }
                if (singleLetter.equals(result[j])) {
                    new LetterSummary();
                }
            }
            LetterSummary letterSummary = new LetterSummary();           //create object
            letterSummary.letter = singleLetter;                        //object letter = letter
            letterSummary.count = 1;
            result[i] = letterSummary;                                  // make  array  with objects

            if (letter.length() == 1) {
                return result;
            }

            letter = letter.substring(1);         //next letter = substring wish index(1) следуюшчая буква
        }
        return result;
    }

    void size(String[] letter, int count) {
        String[] newArray = new String[letter.length];
        for (int i = 0; i < count; i++) {
            newArray[i] = letter[i];
        }
       LetterSummary[] len = new LetterSummary[newArray.length];
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