package mavenprogram.mavenprogram;

public class a {
	private int id;
	
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public void sum(float b,int a)
	{
		System.out.println(a+b);
	}
	public void show()
	{
		System.out.println("in a");	
	}
}