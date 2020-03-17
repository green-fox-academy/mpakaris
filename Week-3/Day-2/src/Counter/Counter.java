package Counter;

public class Counter {

    int counter = 0;
    int counterDefault;

    // Constructor 1 with no Value sent
    public Counter(){

    }
    //Constructor 2 with value sent 7
    public Counter(int counterDefault){
        this.counter = counterDefault;
        this.counterDefault = counterDefault;
    }

    public void add(int numberToAdd){
        this.counter += numberToAdd;
    }

    public void add(){
        this.counter++;
    }

    public int get(){
        return this.counter;
    }

    public void reset(){
        this.counter = this.counterDefault;
    }






}
