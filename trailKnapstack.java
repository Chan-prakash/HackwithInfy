package HackwithInfygreedy;
import java.util.*;

public class trailKnapstack {
    
    // Item class to hold weight, value, and ratio
    static class Item {
        int weight;
        int value;
        double ratio;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
            this.ratio = (double) value / weight;  // Calculate value-to-weight ratio
        }
        
        public String toString() {
            return "Item [weight=" + weight + ", value=" + value + ", ratio=" + ratio + "]";
        }
    }

    // Fractional Knapsack function
    static double knapsack(Integer[] val, Integer[] wt, int capacity) {
        int n = val.length;
        List<Item> items = new ArrayList<>();

        // Step 1: Create the item list with value, weight, and ratio
        for (int i = 0; i < n; i++) {
            items.add(new Item(wt[i], val[i]));
        }

        // Step 2: Sort items by ratio in descending order
        items.sort((a, b) -> Double.compare(b.ratio, a.ratio));

        double res = 0;
        int i = 0;

        // Step 3: Fill the knapsack
        while (capacity > 0 && i < n) {
            Item currentItem = items.get(i);

            if (currentItem.weight <= capacity) {
                // Take the full item
                res += currentItem.value;
                capacity -= currentItem.weight;
            } else {
                // Take a fractional part of the item
                res += currentItem.ratio * capacity;
                capacity = 0; // Knapsack is full
            }
            i++; // Move to the next item
        }

        return res;
    }

    public static void main(String[] args) {
        Integer val[] = {60, 100, 120};
        Integer wt[] = {10, 20, 30};

        int capacity = 50;
        double result = knapsack(val, wt, capacity);
        
        // Print the maximum value that can be achieved
        System.out.println("Maximum value in Knapsack: " + result);
    }
}
