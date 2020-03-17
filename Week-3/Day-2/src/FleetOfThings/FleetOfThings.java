package FleetOfThings;

public class FleetOfThings {
    public static void main(String[] args) {
        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main` method
        // - Download those, use those
        // - In the main method create a fleet
        // - Achieve this output:
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Fleet fleet = new Fleet();

        Thing getMilk = new Thing("Get Milk");
        Thing removeObstacles = new Thing("Remove Obstacles");
        Thing standUp = new Thing("Stand Up");
        Thing eatLunch = new Thing("Eat lunch");

        fleet.add(getMilk); // Adds the items to the Fleet-list
        fleet.add(removeObstacles);
        fleet.add(standUp);
        fleet.add(eatLunch);

        standUp.completeTask(); // Sets completed Tasks to True
        eatLunch.completeTask();

        System.out.println("Fleet of Things to Do:");
        System.out.println(fleet);


    }

}
