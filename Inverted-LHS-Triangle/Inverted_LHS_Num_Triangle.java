import java.util.Scanner;
class Inverted_LHS_Num_Triangle
{
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of Rows: ");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++)
         {
           for(int j = 1; j <= rows+1-i; j++)
            {
                System.out.print(j);
            }
            
             System.out.println();
         }
    }
}