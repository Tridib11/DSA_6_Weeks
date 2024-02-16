public class calculatePowerDemo {
    public static void main(String[] args) {
        long startTime=System.nanoTime();
        System.out.println(calculatePowerDemo1(2, 10));
        long endTime=System.nanoTime();
        double durationInNano=endTime-startTime;
        double durationInMillis = durationInNano / 1_000_000.0;
        System.out.println(durationInMillis);
    }

    public static int calculatePowerDemo1(int x, int n) {
        if (n == 0) return 1;
        return x * calculatePowerDemo1(x, n - 1);
    }
}
