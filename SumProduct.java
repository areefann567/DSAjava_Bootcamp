import java.util.Scanner;

public class SumProduct {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=addsub(num);
        System.out.println(ans);
    }
   public static int addsub(int n){
        int product= 1,sum = 0,rem;
        while(n>0)
        {
            rem=n%10;  //234-->4
            product=product*rem;
            sum=sum+rem;
            n=n/10;  //234-->23

        }
       return product-sum;
    }
}
