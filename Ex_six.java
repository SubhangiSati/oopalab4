import java.lang.*;

class SuperModifier
{
	int a;
	private int b;
	protected int c;
	SuperModifier(int a, int b, int c)
	{
	this.a=a;
	this.b=b;
	this.c=c;
	}
	public void p1()
	{
	System.out.println("Public Method");
	}
	private void p2()
	{
	System.out.println("Private Method");
	}
	protected void p3()
	{
	System.out.println("Protected Method");
	}
	void p4()
	{
	System.out.println("Default Method");
	}
}
class SubModifier extends SuperModifier
{
	private int d;
	SubModifier(int a, int b, int c, int d)
	{
	super(a,b,c);
		this.d=d;
	}
}

class Ex_six
{
	public static void main(String args[])
	{
	SubModifier s = new SubModifier(1,2,3,4);
	s.p1();
	s.p2();
	s.p3();
	s.p4();
	System.out.println(s.a);
	System.out.println(s.b);
	System.out.println(s.c);
	System.out.println(s.d);
	}
}