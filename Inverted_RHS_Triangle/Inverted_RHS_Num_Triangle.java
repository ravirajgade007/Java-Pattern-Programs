import java.util.Scanner;
class Inverted_RHS_Num_Triangle
{
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of Rows: ");
        int rows = sc.nextInt();

        for(int i = rows; i >= 1; i--)
         {
           for(int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }

             for(int k = i; k >= 1; k--)
              {
                System.out.print(k);
              }
            
             System.out.println();
         }
    }
}