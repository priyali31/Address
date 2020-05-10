import java.util.*;
import java.io.*;
class Add
{
	private String add1;	 
	private String add2;
	private String city;
	private String state;	
	private long zip;

Add()
{
}
Add(String add1,String add2,String city,String state,long zip)
{
super();
this.add1=add1;
this.add2=add2;
this.city=city;
this.state=state;
this.zip=zip;
}

public String getadd1()
{
return this.add1;
}
public String getadd2()
{
return this.add2;
}
public String city()
{
return this.city;
}
public String state()
{
return this.state;
}
public String zip()
{
return this.zip;
}

public String toString()
{
return this.add1+" "+this.add2+" "+this.city+" "+this.state+" "+this.zip;
}


}

