package lab8;

public class Spider extends Animal 
{
    public Spider(int legs)
    {
    	super(legs);
    }
	public String eat()
	{
		String a =("Sivri sinek, sinek, guve gibi hayvan turlerini yiyerek beslenmesini surdurur");
		return a;
	}
	public void info()
	{
		System.out.println("Orumcek ayak sayisi : "+legs+"\n"+eat());
	}
   


   
}
