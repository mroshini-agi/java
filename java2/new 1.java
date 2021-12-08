package myfirst;

public class Exception {
	 public static void main(String[] args) {  
         
         try{    
              int a[]=new int[5];    
              a[5]=30/0;    
             }    
             catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception occurs");  
                }    
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                }    
                      
             System.out.println("rest of the code");  
             
    // arithmetic Exception
            
             try {
                 int a = 30, b = 0;
                 int c = a/b;  // cannot divide by zero
                 System.out.println ("Result = " + c);
             }
             catch(ArithmeticException e) {
                 System.out.println ("Can't divide a number by 0");
             }
    //nullpointer
             String ptr = null;
             
             
             try
             {
                 
                 if (ptr.equals("gfg"))
                     System.out.print("Same");
                 else 
                     System.out.print("Not Same");
             }
             catch(NullPointerException e)
             {
                 System.out.println("NullPointerException Caught");
             }
    
             
             
    //ArrayIndexOutOfBounds Exception
             
             try{
                 int a[] = new int[5];
                 a[6] = 9; // accessing 7th element in an array of
                           // size 5
             }
             catch(ArrayIndexOutOfBoundsException e){
                 System.out.println ("Array Index is Out Of Bounds");
             }
             
             
  }  

}


-----------------------------------------------------




public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks");
int marks = sc.nextInt();
try{
if(marks<200)
{
throw new StudentFailed("marks less than 200 failed exception");
}
else {
System.out.println("student marks is: "+marks);
}
}
catch(StudentFailed e)
{
System.out.println(e);
}
System.out.println("\n");

System.out.println("enter the number");
int num = sc.nextInt();
try{
if(num<0)
{
throw new NegativeNumber("number is less than 0, negative exception");
}
else {
System.out.println("number is: "+num);
}
}
catch(NegativeNumber ex)
{
System.out.println(ex);
}
System.out.println("\n");

System.out.println("enter the string");
String str = sc.next();
try{
if(str.length()<0)
{
throw new PasswordgLengthNotMatch("string length is less than 0, password lentgh not grater than 10 exception");
}
else {
System.out.println("string is: "+str);
}
}
catch(PasswordgLengthNotMatch ex)
{
System.out.println(ex);
}
System.out.println("\n");

System.out.println("enter the number");
int num1 = sc.nextInt();
try{
if(num1%2!=0)
{
throw new NotEven("number is not divisible by 2, not even exception");
}
else {
System.out.println("number is: "+num1);
}
}
catch(NotEven ex)
{
System.out.println(ex);
}
}
}



class StudentFailed extends Exception
{

public StudentFailed (String message) {
super(message);
}

}
class NegativeNumber extends Exception
{

public NegativeNumber (String message) {
super(message);

}

}
class PasswordgLengthNotMatch extends Exception
{

public PasswordgLengthNotMatch (String message) {
super(message);

}

}
class NotEven extends Exception
{

public NotEven (String message) {
super(message);

}
}


-----------------------------------------------

public class demoo {
    public static void main(String aa[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=s.nextInt();

    int numbers[]= new int[size];
    System.out.println("Enter the elements of array : ");
    for(int i=0;i<size;i++)
    {
    numbers[i]=s.nextInt();
    }      

    System.out.println("Printing all the entered elements of array");
    for(int i=0;i<numbers.length;i++)
    {
        System.out.println(numbers[i]);
    }

    }
}

------------------------------------

public class demoo {
    public static void main(String aa[])
    {
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=s.nextInt();

    int numbers[]= new int[size];
    System.out.println("Enter the elements of array : ");
    for(int i=0;i<size;i++)
    {
    numbers[i]=s.nextInt();
    }      

    System.out.println("Printing all the entered elements of array");
    for(int i=0;i<numbers.length;i++)
    {

    sum=sum+numbers[i];
    }
    System.out.println(sum);
    }
}

--------------------------------------------

package myfirst;
import java.util.Scanner;
public class Exception {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
		}
		System.out.println(" array elements are");
		for(int i=0;i<size;i++) {
		System.out.println(arr[i]);
		}
		//average of array elements
		float avg;
		int sum=0;
		for(int i=0;i<size;i++) {
		sum+=arr[i];
		}
		avg=(sum/size);
		System.out.println(" average array elements is"+avg);

		//Smallest and greatest element in an array
		int temp;
		for (int i = 0; i < size; i++)
		{
		for (int j = i + 1; j < size; j++)
		{
		if (arr[i] > arr[j])
		{
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		}
		System.out.println(" smallest array elements is"+arr[0]);
		System.out.println(" greatest array elements is"+arr[size-1]);

		//find vowels and vowels count
		System.out.println("enter the array size");
		int s=sc.nextInt();
		char a[]=new char[s];
		System.out.println("enter array elements");
		for(int i=0;i<s;i++) {
		a[i]=sc.next().charAt(0);

		}
		int count=0;
		System.out.println("vowels in array elements");
		for(int i=0;i<s;i++) {
		if(a[i]=='a'||a[i]=='A'||a[i]=='e'||a[i]=='E'||a[i]=='i'||a[i]=='I'||a[i]=='o'||a[i]=='O'||a[i]=='u'||a[i]=='U') {
		System.out.println(a[i]);
		count++;
		}


		}
		System.out.println("vowels count in array elements " +count);

		}

}



-----------------------------------


public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the array size");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("enter array elements");
for(int i=0;i<size;i++) {
arr[i]=sc.nextInt();
}
System.out.println(" array elements are");
for(int i=0;i<size;i++) {
System.out.println(arr[i]);
}
System.out.println(" enter the number to search");
int num=sc.nextInt();
int count=0;
for(int i=0;i<size;i++) {
if(num==arr[i]) {
count++;
}
}
System.out.println("number of occurance of "+num+" is "+count);

}