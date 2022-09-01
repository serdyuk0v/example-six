public class Main {
    public static void main(String[] args) {
        int[] cash = generateRandomArray();
        int minCashDay = cash[0];
        int maxCashDay = cash[0];

        for (int current : cash) {
            if (current > maxCashDay) {
                maxCashDay = current;
            }
        }

        for (int current : cash) {
            if (current < minCashDay) {
                minCashDay = current;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %s рублей. \n" +
                "Максимальная сумма трат за день составила %s рублей.", minCashDay, maxCashDay);
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] cash = new int[30];
        for (int i = 0; i < cash.length; i++) {
            cash[i] = random.nextInt(100_000) + 100_000;
        }
        return cash;
    }
}