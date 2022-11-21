package lab8;

public class Main {

	public static void main(String[] args) 
	{
		Fish d = new Fish(0,"Nemo");
		Cat c= new Cat(4,"Garfield");
		Animal a = new Fish(0,"Zilli");
		Animal e = new Spider(8);
		Pet p = new Cat(4,"Zoro");
		
	   d.info();
	   c.info();
	   a.info();
	   e.info();
	   p.info();

	}

}
