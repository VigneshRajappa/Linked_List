import java.util.Scanner;
class FactorialRecursion{

    public static int Factorialof(int n){
        if(n==1){
            return n;
        }
        return n*Factorialof(n-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Factorialof(num));
    }
    
}