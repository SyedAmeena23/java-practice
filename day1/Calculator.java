import java.util.Scanner;

public class Calculator{
     public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter first operand");
       int op1=sc.nextInt();
       System.out.println("Enter second operand");
       int op2=sc.nextInt();
       System.out.println("Enter operation(+,-,*,/)");
       char op=sc.next().charAt(0);

       int res=0;

       switch(op){
         case '+': res=op1+op2;
                   break;
         case '-': res=op1-op2;
                   break;
         case '*': res=op1*op2;
                   break;
         case '/': res=op1/op2;
                   break;
         default : System.out.println("Invalid operator");
       }
       System.out.println("Result is "+res);
     }
}

Output:
Enter first operand
10
Enter second operand
2
Enter operation(+,-,*,/)
*
Result is 20
