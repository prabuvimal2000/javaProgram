import java.util.*;
public class FizzBuzz
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner (System.in);
   int num= sc.nextInt();
   int i=1;
   while(i<=num)
   {
    if(i%3==0 && i%5==0)
   {
     System.out.println("FizzBuzz");
   }
   else if(i%3==0)
   { 
       System.out.println("Fizz");
   }
   else if(i%5==0)
   {
     System.out.println("Buzz");
   }
   
   else
   {
    System.out.println(i);
   }
   i++;
   }
 }
}
