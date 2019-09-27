import java.util.*;
import java.util.ArrayList;
class Person
{
	String name;
	int age;
	Qualification tenth;
	Qualification tweleveth;
	Address address;
	Phone num1;
	Phone num2;
Person(String name,int age,Qualification tenth,Qualification tweleveth,Address adress1,Phone num1,Phone num2)
{
	System.out.println("NAME IS:"+name);
	System.out.println("AGE IS: "+age);
	//System.out.println("SSC DETAILS ARE:"+tenth);
    //System.out.println("HSC DETAILS ARE: "+tweleveth);
    //System.out.println("ADDRESS IS: "+address);
    //System.out.println("PHONE NUMBER1 IS:"+num1);
    //System.out.println("PHONE NUMBER2 IS:"+p.phnum);
}
public static void main(String [] args)
{
	Qualification q = new Qualification("Rosary School   ",  85  ,"  pune");
	Qualification r = new Qualification("Rosary College  ",  65  ,"  pune");
	Address a = new Address("Siddhivinayak carona  ","  Vimannagar  ",411014,"  pune  ");
	Phone p = new Phone("  office number is  ","   7758025527 ");
	Phone b = new Phone(" home number is:","  8007041142");
	Person e = new Person("AARJU", 21 , q , r , a ,p , b);
	}
}