package a;

class CRectangle
{
	int width;
	int height;
	
	public CRectangle(int w,int h)
	{
		width = w;
		height = h;
		
	}
	
	public CRectangle()
	{
		width = 10;
		height = 8;
	}
	
	public void show()
	{
		System.out.println("width="+width);
		System.out.println("height="+height);
	}
}


public class class01 {
	public static void main(String args[])
	{
		CRectangle rec1 = new CRectangle(5,2);
		rec1.show();
		CRectangle rec2 = new CRectangle();
		rec2.show();
	}

}
