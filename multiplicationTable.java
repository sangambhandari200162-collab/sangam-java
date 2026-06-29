import java.util.Scanner;
public class multiplicationTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter upto which number you want the multiplication table of:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+(i*j)+"\n");

            }
        }
    }
}