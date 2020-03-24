package CharSequence;

import java.util.stream.IntStream;

public class Shifter implements CharSequence {

    private CharSequence string;
    private int shiftIndex;

    public Shifter(String stringToShift, int shiftIndex){
       this.string = stringToShift.subSequence(shiftIndex, stringToShift.length());
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
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
