public class calculatePowerDemo {
    public static void main(String[] args) {

        //1st Function

        long startTime=System.nanoTime();
        System.out.println(calculatePowerDemo1(2, 10));
        long endTime=System.nanoTime();
        System.out.println((endTime-startTime)/1_000_000.0 +" sec");


        long startTime2=System.nanoTime();
        System.out.println(calculatePowerDemo2(2, 10));
        long endTime2=System.nanoTime();
        System.out.println((endTime2-startTime2)/1_000_000.0 +" sec");


    }

    //O(n)
    public static int calculatePowerDemo1(int x, int n) {
        if (n == 0) return 1;
        return x * calculatePowerDemo1(x, n - 1);
    }


    //O(log n)
    public static int calculatePowerDemo2(int x,int n){
        if(n==0) return 1;
        if(n%2==0){
            int temp=calculatePowerDemo2(x, n/2);
            return temp*temp;
        }
        else{
            return calculatePowerDemo2(x, n-1)*x;
        }
    }
}
