import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number:");
    int n=sc.nextInt();
   int sum=0;
while(n!=0){
   sum+=n%10;
   n/=10;
}
System.out.println("Sum of digits  is " + sum);
  }
}

Output
Enter number:
345
Sum of digits  is 12
