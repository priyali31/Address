import java.util.*;
import java.io.*;

class Person
{
  int id;
  private String firstName;
  private String lastName;
  private int mob;
  private String address;

Person(int id,String firstName,String lastName,int mob,String address)
  {
	this.id=id;
	this.firstName=firstName;
	this.lastName=lastName;
	this.mob=mob;
	this.address=address;
  }


public int getId()
  {
  return id;
  }

public String getfirstName()
  {
  return firstName;
  }

public String getlastName()
  {
  return lastName;
  }

public int getMob()
  {
  return mob;
  }

public String getAddress()
  {
  return address;
  }


public void setId(int id)
  {
  this.id=id;
  }

public void setFirstName(String firstName)
  {
  this.firstName=firstName;
  }

public void setLastName(String lastName)
  {
  this.lastName=lastName;
  }

public void setMob(int mob)
  {
  this.mob=mob;
  }

public void setAddress(String address)
  {
  this.address=address;
  }


}
