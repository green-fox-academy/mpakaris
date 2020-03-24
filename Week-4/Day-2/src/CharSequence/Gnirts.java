package CharSequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

    private String gnirts;

    public Gnirts(String setString){
        this.gnirts = invertString(setString);
    }

    private String invertString(String stringToInvert){
        String inverted = "";
        for (int i = stringToInvert.length()-1; i >= 0; i--) {
            inverted += stringToInvert.charAt(i);
        }
        //Control: System.out.println(inverted);
        return inverted;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.gnirts.charAt(index);
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
