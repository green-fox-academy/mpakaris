public class Calculator {

    boolean ishappy;

    public Calculator(){
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public void setHappy(int x) {
        if (x == 1) {
            this.ishappy = false;
        } else
            this.ishappy = true;
    }



}
