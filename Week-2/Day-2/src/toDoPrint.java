public class toDoPrint {
    public static void main(String[] args) {
        System.out.println("");
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indentation

        // Expected output:
        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        // Create proper toDo-text:
        StringBuffer correctString = new StringBuffer(todoText);
        correctString.insert(0, "My todo:\n");
        correctString.insert(21, " - Download Games");
        // System.out.println(correctString);

        // StringBuffer back to normal String
        String part1 = correctString.toString();

        // Second String with Identation of - Diablo
        String addThirdLine = "- Diablo";
        String part2 = addThirdLine.indent(5);

        // Print the Entire "todo-List"
        System.out.println(part1);
        System.out.println(part2);

    }
}
