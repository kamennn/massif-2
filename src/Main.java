public class Main {
    public static void main(String[] args) {
        //задача первая//
        int[] weights = {90,91,93,92,85,87,88,89,0,0,0,0};
        int[] weightsCopy = {90,91,93,92,85,87,88,89,0,0,0,0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if(arraysAreEqual) {
            System.out.println("Массивы одинаковы");
        }else {
            System.out.println("Массивы разные");
        }
        int maxWeight = -1;
        for (int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            System.out.println(weights[i+1] - weights[i]);
        }

    }
}