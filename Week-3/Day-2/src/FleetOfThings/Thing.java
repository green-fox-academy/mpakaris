package FleetOfThings;

public class Thing {

    String name;
    boolean markedAsDone;

    public Thing(String thing){ // Creates the "Things"
        this.name = thing;
    }

    public void completeTask(){ // sets the Things to completed
        this.markedAsDone = true;
    }


    public String toString() {
        return (this.markedAsDone ? "[x] " : "[ ] ") + this.name;
    }



}
