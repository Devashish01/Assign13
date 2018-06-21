import java.util.HashSet;
import java.util.Scanner;
class A
{
	void function()
	{ 
	HashSet<String> obj1 = new HashSet<String>();
    
    Scanner input=new Scanner(System.in);
    System.out.println("Enter elements for first Hashset");
    for(int i=0;i<4;i++)
    {
        String n=input.nextLine();
        obj1.add(n);
    }
    HashSet<String> obj2 = new HashSet<String>();
    System.out.println("Enter elements for Second Hashset");
    for(int i=0;i<4;i++)
    {
         String n=input.nextLine();
         obj2.add(n);
    }
      System.out.println("First Hashset= "+obj1);
      System.out.println("Second Hashset= "+obj2);
      obj1.retainAll(obj2);
      System.out.println("Hashet:"+obj1);
		
	}
	
}
  public class Compare {
  public static void main(String[] args) {
	  
	  A obj=new A();
	  obj.function();
	  
       
     }
}