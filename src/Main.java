public class Main {
    public static void main(String[] args) {
        int[] cash = generateRandomArray();
        int minCashDay = 200000;
        int maxCashDay = 100000;

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
        System.out.println("Минимальная сумма трат за день составила " + minCashDay + " рублей. Максимальная сумма трат за день составила " + maxCashDay + " рублей.");
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