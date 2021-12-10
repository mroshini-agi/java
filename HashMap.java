package myfirst;

import java.util.*;


public class hashmap {
	public static void main(String args[]) {
	HashMap<Integer,String>map=new HashMap<>();
	
	map.put(1,"abc");
	map.put(2,"xyz");
	map.put(3,"wer");
	System.out.println(map);
	
	for(Map.Entry<Integer, String> me : map.entrySet())
	{
		System.out.println(me.getKey()+  "and" +me.getValue());
	}
	
//color
   HashMap<String,String>col=new HashMap<>();
	
	col.put("color1","red");
	col.put("color2","black");
	col.put("color3","pink");
	
	for(Map.Entry<String, String> co : col.entrySet())
	{
		System.out.println(co.getKey()+  ":" +co.getValue());
	}
	
//	languages
    HashMap<String,Integer>lan=new HashMap<>();
	
	lan.put("java",79);
	lan.put("php",60);
	lan.put("andriod",90);
	
	for(Map.Entry<String, Integer> lg : lan.entrySet())
	{
		System.out.println(lg.getKey()+  ":" +lg.getValue());
	}
	}
}

----------------------------------

package myfirst;

import java.util.HashMap;
import java.util.Map;

public class tech {
	public static void main(String args[]) {
		HashMap<String,techer>map=new HashMap<>();
		
		techer e1=new techer("Roshini",10000,1);
	    techer e2=new techer("chandini",15000,2);    
	    map.put("emp1",e1);
	    map.put("emp2",e2);
	    
	    for(Map.Entry<String,techer> me : map.entrySet())
		{
			System.out.println(me.getKey()+  ":" +me.getValue());
		}
		
	}
}
	class techer{
		String name;
		int id,clas;
		public techer(String name, int clas, int id) {
			super();
			this.name = name;
			this.clas = clas;
			this.id = id;
		}
		public String toString() {
			return "Name : "+name+ "price :"+clas+  "id :"+id;
			
		}
}

----------------------------
package myfirst;

import java.util.HashMap;
import java.util.Map;

public class emplo {
	public static void main(String args[]) {
		HashMap<String,employ>map=new HashMap<>();
		
		employ e1=new employ("Roshini",1000,101);
	    employ e2=new employ("chandini",1500,102);    
	    map.put("emp1",e1);
	    map.put("emp2",e2);
	    
	    for(Map.Entry<String,employ> me : map.entrySet())
		{
			System.out.println(me.getKey()+  ":" +me.getValue());
		}
		
	}
}
	class employ{
		String name;
		int id,salary;
		public employ(String name, int salary, int id) {
			super();
			this.name = name;
			this.salary = salary;
			this.id = id;
		}
		public String toString() {
			return "Name : "+name+ "price :"+salary+  "id :"+id;
			
		}
	}

--------------------------------
package myfirst;
import java.util.*;

public class hashmapobj {
	public static void main(String args[]) {
		HashMap<String,Book>map=new HashMap<>();
		
		Book b1=new Book("Mark Twain",1000,101);
	    Book b2=new Book("Lewis Wallace",1500,102);    
	    map.put("book1",b1);
	    map.put("book2",b2);
	    
	    for(Map.Entry<String,Book> me : map.entrySet())
		{
			System.out.println(me.getKey()+  ":" +me.getValue());
		}
		
	}
}
	class Book{
		String name;
		int id,price;
		public Book(String name, int price, int id) {
			super();
			this.name = name;
			this.price = price;
			this.id = id;
		}
		public String toString() {
			return "Name : "+name+  "price :"+price+  "id :"+id;
			
		}
	}

----------------------------------------------

package myfirst;

import java.util.ArrayList;

public class arraylist {
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> inner = new ArrayList<Integer>();
		ArrayList<Integer> inner1 = new ArrayList<Integer>();
		inner.add(100);
		inner.add(200);
		inner1.add(300);
		inner1.add(400);
		outer.add(inner);
		outer.add(inner1);
		System.out.println(outer);
	}
}
-----------------------------------------

package javademo;
import java.util.*;



public class set1 {
public static void main(String[] args) {
HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
List<Integer> al = new ArrayList<>();

al.add(10);
al.add(20);
al.add(30);
al.add(1);
al.add(2);
System.out.println(al);
al.remove(1);
al.remove(1);
System.out.println(al);




hash_map.put(10, "Hi");
hash_map.put(15, "4");
hash_map.put(20, "Hi");
hash_map.put(25, "Welcomes");
hash_map.put(30, "You");



hash_map.clear();
System.out.println(hash_map);

System.out.println("Initial Mappings are: " + hash_map);
System.out.println("The set is: " + hash_map.keySet());

System.out.println("Is the key '20' present? " + hash_map.containsKey(20));

System.out.println("The size of the map is " + hash_map.size());

HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>();
new_hash_map.putAll(hash_map);
System.out.println("The new map looks like this: " + new_hash_map);


System.out.println("First Map: "+ hash_map);
System.out.println("Second Map: "+ hash_map);
System.out.println("Equality: " + hash_map.equals(hash_map));


System.out.println("The Value is: " + hash_map.get(25));

}
}

-----------------------------------


package myfirst;
import java.util.*;
public class numbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> main = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> prime = new ArrayList<Integer>();
		int a;
		System.out.println("enter elements:");
		for(int i=1;i<=10;i++) {
			a=sc.nextInt();
			main.add(a);
		}
		System.out.println(main);
		int flag=0;
		for(int l:main) {
			if(l%2==0) {
				even.add(l);
		}
		else {
			odd.add(l);

		for(int i=2;i<=l/2;i++){
			if(l%i==0){
				flag=1;
				break;
		}
		}
		if(flag==0){
			prime.add(l);
		}
		}

		}

		System.out.println("even elements: "+even);
		System.out.println("odd elements: "+odd);

		System.out.println("prime elements: "+prime);

		}
}

--------------------------

Scanner sc=new Scanner(System.in);
ArrayList<Integer> main = new ArrayList<>();
ArrayList<Integer> even = new ArrayList<Integer>();
ArrayList<Integer> odd = new ArrayList<Integer>();
ArrayList<Integer> prime = new ArrayList<Integer>();
int a;
System.out.println("enter arraylist elements");
for(int i=1;i<=20;i++) {
a=sc.nextInt();
main.add(a);
}
System.out.println(main);
int flag=0;
for(int l:main) {
boolean even1 = false;
boolean prime1 = true;


if(l % 2 == 0){
even1 = true;
prime1 = false;
}
else {
for(int i=3; i*i<=l; i+=2) {
if(l % i == 0) {
prime1 = false;
}
}
}

if(even1){
even.add(l);
}
else {
if(prime1){
prime.add(l);
}
else {
odd.add(l);
}
}
}
System.out.println("even arraylist is: "+even);
System.out.println("odd arraylist is: "+odd);

System.out.println("prime arraylist is: "+prime);

----------------------------------------

