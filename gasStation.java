package HackwithInfygreedy;
import java.util.*;

public class gasStation {
    static int gasM(int gas[], int cost[]) {
        ArrayList<Integer> diff = new ArrayList<>();
        int total = 0;
        int n = gas.length;
        int totalGas = 0;
        int totalCost = 0;
        int start = 0; // Variable to track the starting gas station

        for (int i = 0; i < n; i++) {
            diff.add(i, gas[i] - cost[i]);
            totalGas += gas[i];
            totalCost += cost[i];
        }

        // If total gas is less than total cost, return -1
        if (totalGas < totalCost) {
            return -1;
        }

        for (int i = 0; i < diff.size(); i++) {
            total += diff.get(i);
            if (total < 0) {
                total = 0;
                start = i + 1; // Reset starting position
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int gas[] = {2,3,4};
        int cost[] = {3, 4,3};
        System.out.println(gasM(gas, cost));
    }
}
