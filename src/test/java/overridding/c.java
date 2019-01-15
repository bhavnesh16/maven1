package overridding;

import mavenprogram.mavenprogram.a;

public class c {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        a obj=new b(); //compile 
        obj.show();
        obj=new a(); //run time 
        obj.show();
	}
}
