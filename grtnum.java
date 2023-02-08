import java.util.*;
class grtnum
{
 public static void main(String args[])
 {
  int num1,num2; 
  Scanner scan=new Scanner(System.in);
  System.out.println("enter the two numbers");
  num1=scan.nextInt();
  num2=scan.nextInt();
     if(num1>num2)
      {
       System.out.println("the first number is greater than second number");
      }
     else if(num2>num1)
      {
       System.out.println("The Second Number Is Greater Than The First Number.");
          }

        else
         {
            System.out.println("Both are Equal.");
         }

 }

}