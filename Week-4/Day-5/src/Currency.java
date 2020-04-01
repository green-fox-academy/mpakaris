public class Currency {

    private String code, centralBankName;
    private int value;

    public Currency(String code, String centralBankName, int value) {
        this.value = value;
    }

    public void setValue(int cashToAdd) {
        this.value += cashToAdd;
    }

    public int getValue() {
        return this.value;
    }
}
