package a;

// app9_13, 傳遞物件陣列到method
class CCircle        // 定義類別CCircle
{
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)
   {
      radius=r;
   }
   public static double average(CCircle c[])  // compare() method
   {
      double sum=0.0;
      for(int i=0;i<c.length;i++)
    	  sum+=c[i].radius;
      return (sum/c.length);
   }
}

public class app9_13
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir=new CCircle[3];
      cir[0]=new CCircle(1.0);
      cir[1]=new CCircle(4.0);
      cir[2]=new CCircle(2.0);

      System.out.println("average radius = "+CCircle.average(cir));
   }
}

/* app9_13 OUTPUT-------
Largest radius = 4.0
----------------------*/