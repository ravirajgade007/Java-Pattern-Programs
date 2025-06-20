import java.util.Scanner;
class Star_Pyramid
{
  public static void main(String [] args)
  {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the No of Rows:");
     int rows = sc.nextInt();

     for(int i = 1; i <= rows; i++)
      {
        for(int j = i; j <= rows - 1; j++)
         {
            System.out.print(" ");  
          }
           for(int k = 1; k <= (i*2-1); k++)
            {
               System.out.print("*");
            }
             System.out.println();
      }
  }
}