import java.util.Scanner;
class Inverted_LHS_Triangle
{
   public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of Rows: ");
        int rows = sc.nextInt();

        for(int i = rows; i>=1; i--)
         {
	    for(int j = 1; j <= i; j++)
             {
 		System.out.print("*");
	      }
              
              System.out.println();
          }
     }
}