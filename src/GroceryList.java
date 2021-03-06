import java.util.ArrayList;


public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryList(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println( theItem + " has been removed from the Grocery List.");
    }

    public String findItem(String searchItem) {
        int position = groceryList.indexOf(searchItem);
        if(position >= 0) return groceryList.get(position);

        return null;
    }
}
