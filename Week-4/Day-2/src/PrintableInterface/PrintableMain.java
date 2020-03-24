package PrintableInterface;

import java.util.ArrayList;
import java.util.List;

public class PrintableMain {
    public static void main(String[] args) {
        System.out.println();
        // Create Lists:
        ArrayList<Todo> todos = new ArrayList<>();
        ArrayList<Domino> dominoes = new ArrayList<>();
        // Create Objects
        Todo todo = new Todo("Buy Milk", "high", true);
        Domino domino = new Domino(3, 2);
        // Put Objects into Lists
        todos.add(todo);
        dominoes.add(domino);
        // Print for all Objects in Lists
        for (Domino d : dominoes) {
            d.printAllFields();
        }
        System.out.println("-----------------------------------------------");
        for (Todo t : todos) {
            t.printAllFields();
        }

    }
}
