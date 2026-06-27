import java.util.Scanner;
public class weightDeterminer{
  public static void main(String[] args) { 
Scanner sc=new Scanner(System.in);
  System.out.println("enter your weight");
  int weight=sc.nextInt();
  String result=(weight>=80)? "you are thalthali":"you are not thalthali";
  System.out.println(result);
  
  }
}