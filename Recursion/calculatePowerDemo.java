public class calculatePowerDemo {
    public static void main(String[] args) {
        System.out.println(calculatePowerDemo1(2, 10));
    }

    public static int calculatePowerDemo1(int x, int n) {
        if (n == 0) return 1;
        return x * calculatePowerDemo1(x, n - 1);
    }
}
