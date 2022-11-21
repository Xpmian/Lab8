package lab8;

public interface Pet 
{
  String play();
  default void setName(String name)
  {
  }
  default String getName()
  {
	  return null;
  }
  void info();
}
