package teststeps;

public class MethodsAndClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //this space is only for execution, methods should not be written here
		//java throws an error if youtry to declare methods inside this execution block
		MethodsAndClass d = new MethodsAndClass();
		String name = d.getData();
		System.out.println(name);
		//if i want to call methods of CallingMethodsFromAnotherClass class i need to create a object of that class here
		CallingMethodsFromAnotherClass clr = new CallingMethodsFromAnotherClass();
		clr.getUserData();
		getUrlData();
		
	}
   //methos
	
	public String getData()  //here the acces modifier is public which means this method can be used in this class and other class aswell
	{            // here the return type is void that means this method returns nothing
		         //if you want to access this public method you cant do itr directly first you should create a object of that class and use the method
		System.out.println("hello world");
		return "rahul shetty";
	}
	//if we define the method as static you will be able to access the method easily without creating the object - only inside the class  
   public static String getUrlData()
   {
	   System.out.println("print the url");
	   return "Rahul";
   }

}
