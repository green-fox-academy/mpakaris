package CharSequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

    private String toChange;
    private int index;
    public Gnirts(String toChange, int index) {
        this.toChange = toChange;
        this.index = index;
    }

    @Override
    public int length() {
        return this.toChange.length();
    }

    @Override
    public char charAt(int index) {
        return this.toChange.charAt(toChange.length()-1-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.toChange.subSequence(start, end);
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return toChange.codePoints();
    }
}
