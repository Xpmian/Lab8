package lab8;

public class Fish extends Animal implements Pet
{
  protected String name;

public Fish(int legs, String name) 
{
	super(legs);
	this.name = name;
}

public String getName() 
{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}
public String play()
{
	String b=(getName()+" Yuzmeyi cok sever");
	return b;
}
public String walk()
{
	String a =(getName()+"nun bacaklari yoktur yuruyemez, yuzer");
	return a;
}
public String eat()
{
	String c =(getName()+" kucuk baliklari yer");
	return c;
}
public void info()
{
	System.out.println(getName()+" bacak sayisi : "+legs+"\n"+play()+"\n"+walk()+"\n"+eat());
}
}
