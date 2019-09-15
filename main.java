import java.util.*;
import java.lang.Math;
class bank
{
 public double p;
 public int t;
 public double r;
}

class savings extends bank
{
 public void info(double a,int b,double c)
 {
  Scanner s=new Scanner(System.in);
  p=a;
  t=b;
  r=c;
  double w;
  System.out.println("Enter the amount u wish to withdraw");
  w=s.nextDouble();
  double CI=(p-w)*Math.pow((1+r),t);
  System.out.println("Compound interst of ur principle amount ="+CI);
 }
 
 
}

class current extends bank
{
 public void info(double a,int b,double c)
 {
  p=a;
  t=b;
  r=c;
  if(p<=1000)
    System.out.println("Your account balance is running below the minimum balance ,hence you will be charged penalty");
  else
   System.out.println("U are eligible to receive and use check book");
 }
}
class main
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  savings a1=new savings();
  current a2=new current();
  System.out.println("Enter the value of principle amount");
  double a=s.nextDouble();
  System.out.println("Enter the value of time in years");
  int b=s.nextInt();
  System.out.println("Enter the value of rate of interest in percentage");
  double c=s.nextDouble();
  System.out.println("If ur account is savings : press 1\nif ur account is current account : press 2");
  int n=s.nextInt();
  if(n==1)
   a1.info(a,b,c);
  else
   a2.info(a,b,c);
 }
}
