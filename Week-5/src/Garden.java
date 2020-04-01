import java.util.ArrayList;
import java.util.List;

public class Garden {

    private ArrayList<Plant> gardenList = new ArrayList<>();

    public void addToGarden(Plant plant) {
        this.gardenList.add(plant);
    }

    public void removeFromGarden(Plant plant) {
        this.gardenList.remove(plant);
    }

    public ArrayList<Plant> getGardenList() {
        return gardenList;
    }
}
