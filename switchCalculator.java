import java.util.Scanner;
public class switchCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the operator (+,-,*,/,^");
         char operator = sc.next().charAt(0);
System.out.println("enter the first number:");
float num1=sc.nextFloat();
System.out.println("enter the second number");
float num2=sc.nextFloat();
switch(operator){
    case '+':
        System.out.println("the sum of two number you entered is: "+ (num1+num2));
    break;
    case '-':
        System.out.println("the difference of two number you entered is: "+(num1-num2));
break;
    
    case '/':
        System.out.println("the division of two number you entered is: "+(num1/num2));
    break;

    case '*':
        System.out.println("the product of two number you entered is: "+(num1*num2));
        break;
        default:
            System.out.println("please enter a valid number");
    }
}
    
}
