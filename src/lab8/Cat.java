package lab8;

public class Cat extends Animal implements Pet
{
   protected String name;

public Cat(int legs) 
{
	super(legs);
}
public Cat(int legs,String name)
{
	super(legs);
	this.name=name;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public String play()
{
	String a=(getName()+" sopali oyuncaklar, hisirtili sesler cikaran kagittlar, sise kapaklari ve ip yumaklari ile oynamayi sever");
	return a;
}
public String eat()
{
	String b =(getName()+" kirmizi etin yani sira tavuk, hindi ve balik eti verebilirsiniz");
	return b;
}
public void info()
{
	System.out.println(getName()+" ayak sayisi : "+legs+"\n"+play()+"\n"+eat());
}
}
