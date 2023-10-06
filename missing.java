import java.util.*;
public class missing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = 0;
        for(int i =0; i<n-1; i++){
            long s = sc.nextLong();
            a = a+s;
        }
        n=(n*n+n)/2;
        System.out.print(n-a);
    }
    
}
