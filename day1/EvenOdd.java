import java.util.Scanner;

public class EvenOdd{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number to check");
    int n=sc.nextInt();
    if (n>=0){
       if (n%2==0){
         System.out.println(n + " is even");
    } else  {
       System.out.println(n + " is odd");
       }
    } else{
       System.out.println(n + " is negative");
    }
  }
}

Output:
Enter number to check
6
6 is even

Enter number to check
-1
-1 is negative
