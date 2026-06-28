import java.util.Scanner;
public class javaArray{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the no of student you wanna store the name of:");
    int n=sc.nextInt();
    String[] name=new String[n];
    for(int i=0;i<name.length;i++){
        System.out.println("enter the name of student "+i);
        name[i]=sc.nextLine();
    }
    System.out.println("\nthe names you entered are: ");
     for(int i=0;i<name.length;i++){
        System.out.println(name[i]);

}
}
}