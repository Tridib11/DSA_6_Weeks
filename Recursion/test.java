import java.util.*;
public class test{
    public static void main(String[] args) {
        func2(3);
    }

    static void func2(int n){
        if(n==0) return;
        System.out.println(n);
        func2(n-1);
        System.out.println(n);
    }
}