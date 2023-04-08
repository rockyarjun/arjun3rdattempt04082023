package teststeps;

public class CallingMethodsFromAnotherClass {

	public void getUserData()
	{
		System.out.println("hello world");//1.if you change the access modifiers to Private
		                                  //2.you wont be able to call the methods inside this class to another class
	}

	}