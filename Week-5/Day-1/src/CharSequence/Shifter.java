package CharSequence;

import java.util.stream.IntStream;

public class Shifter implements CharSequence{

    String word;

    public Shifter(String word, int index) {
        this.word = word;
        this.word.subSequence(index, word.length());
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.word.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.word.subSequence(start, end);
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }
}
