class PlusSign
{
  public static void main(String[] args)
   {
      int num = 6;

       for(int i=1; i<=num; i++)
        {
           for(int j=1; j<=num; j++)
             {
               if(j == 3 || i == 3)
                 {
                    System.out.print("*");
                  }
                 else
                     {
                       System.out.print(" ");
                      }
             }
              System.out.println();
         }
   }
}