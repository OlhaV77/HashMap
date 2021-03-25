import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LetterCountWithMapTest {

    @Test
    public void countLetters_whenEmptyString_returnEmptyArray() {
        LetterSummary[] actual = LetterCountWithMap.countLetters("");

        assertThat(actual).hasSize(0);
    }

    @Test
    public void countLetters_whenOneLetter_returnOneLetterSummary() {
        LetterSummary[] actual = LetterCountWithMap.countLetters("a");

        assertThat(actual).hasSize(1);

        LetterSummary actualLetterSummary = actual[0];
        assertThat(actualLetterSummary.count).isEqualTo(1);
        assertThat(actualLetterSummary.letter).isEqualTo("a");
    }

    @Test
    public void twoLetter() {
        LetterSummary[] actual = LetterCountWithMap.countLetters("ab");

        assertThat(actual).hasSize(2);

        LetterSummary actualFirstLetterSummary = actual[0];
        assertThat(actualFirstLetterSummary.count).isEqualTo(1);
        assertThat(actualFirstLetterSummary.letter).isEqualTo("a");

        LetterSummary actualSecondLetterSummary = actual[1];
        assertThat(actualSecondLetterSummary.count).isEqualTo(1);
        assertThat(actualSecondLetterSummary.letter).isEqualTo("b");
    }



}