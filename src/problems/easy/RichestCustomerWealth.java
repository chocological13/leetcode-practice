package problems.easy;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3}, {4, 5, 6}};
        int maxWealth = maxWealth(arr);
        System.out.println("Richest customer wealth is " + maxWealth);
    }

    public static int maxWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int userWealth = 0;
            for (int money : account) {
            userWealth += money;
        }
            maxWealth = Math.max(maxWealth, userWealth);
        }
        return maxWealth;
    }
}
