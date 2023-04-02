import java.util.Scanner;
public class cube {

   public static void main(String[] args)

{
    int i,n;

    System.out.print("enter number upto wich we want cube: ");
    Scanner in = new Scanner(System.in);
		    n = in.nextInt();

     for(i=1;i<=n;i++)
     {
     System.out.println("cube of " +i+" is : "+(i*i*i));     
    }
 }
}