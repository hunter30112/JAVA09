package a;

// app9_12, ŤŘĽßŞŤĽó°}ŚC
class CCircle        // Šw¸qĂţ§OCCircle
{
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)       // CCircleŤŘşc¤¸
   {
      radius=r;
   }
   public void show()
   {
	  System.out.println("radius="+radius);
      System.out.println(", area="+pi*radius*radius);
   }
}
public class app9_12
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir=new CCircle[6];
      
      for (int i=0; i<cir.length;i++)
      {
    	  cir[i] = new CCircle((double)i);
    	  cir[i].show();
      }

   }
}

/* app9_12 OUTPUT---
area=3.14
area=50.24
area=12.56
------------------*/
