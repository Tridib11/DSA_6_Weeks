public class calculatePowerDemo {
    public static void main(String[] args) {
        int c=calculatePowerDemo1(2, 100);
        System.out.println(c);
    }

    static int calculatePowerDemo1(int x,int n){
        if(n==0) return 1;
        return x*calculatePowerDemo1(x, n-1);
    }
}
