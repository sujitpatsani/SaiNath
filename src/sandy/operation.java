package sandy;

public class operation 
{
	 static int a=20;
	 static int b=20;
	 static int c=a+b;
	public void run()
	{
		System.out.println(c);
	}
 public static void main(String[]args)
 {
	 operation re= new operation();
	 //re.a+=10;
	 re.a= re.a+10;
	 System.out.println(re.a+" "+re.b);
	 operation sc= new operation();
	 System.out.println(sc.a+" "+sc.b);
	 re.run();
	 re.c=re.a+re.b;
	 re.run();
	 System.out.println(re.c);
	 
 }
}
