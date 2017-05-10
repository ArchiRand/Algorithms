public class Backpack {

    public static int backBack (int[] weight, int[] cost, int maxWeight) {
        int n = weight.length;
        int[][] res = new int[maxWeight + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= maxWeight; j++) {
                if (weight[i - 1] <= j) {
                    res[j][i] = Math.max(res[j][i - 1], res[j - weight[i - 1]][i - 1] + cost[i - 1]);
                } else {
                    res[j][i] = res[j][i - 1];
                }
            }

        }
        return res[maxWeight][n];
    }
}
