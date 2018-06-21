
import java.util.Scanner;
import java.util.*;
class B
{
	 Scanner input=new Scanner(System.in);
	void function()
	{
		
		
		
		HashMap<Integer,String> obj1= new HashMap<Integer,String>();
		//int n;
	

		System.out.println("enter the  elemnts");
		
		 for(int j=0;j<5;j++)
		  {
		      String a=input.nextLine();
		      	obj1.put(j,a);
		  }
		for(Map.Entry x:obj1.entrySet()){
			   System.out.println(x.getKey()+" "+x.getValue());
			  }
		
		
	}
}


public class Hashmapp {

	 public static void main(String[] args) {
		  
		  B obj=new B();
		  obj.function();
		  
	       
	     }
	}
