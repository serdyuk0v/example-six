public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int sumDay : arr) {
            sum += sumDay;
        }
        double averageSumDay = (double) sum / arr.length;
        String averageFormat = String.format("%.2f", averageSumDay);
        System.out.println("Средняя сумма трат за месяц составила " + averageFormat + " рублей.");
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}