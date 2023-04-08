package teststeps;

import java.util.ArrayList;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //for comparing the two integers in java we need to use 2 equals  symbols
		//% between two integers gives reminder 
		// writing a code to get the numbers which are divisable by 2
		
		int[] inte = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<inte.length;i++)
		{
			if(inte[i]%2 ==0)
			{
				System.out.println(inte[i]);
				break;
				//break is used to stop the execution
				//c
			}
			else
			{
				System.out.println(inte[i]+" is not multiple of 2");
			}
		}
		
		
		//1.arraylist vs array
		//1.1. array--array are intialized to fixed value at the starting only- static array
		//1.2. arraylist -- they are a class in java and are dynamic and we can use the methods inside it by creating the object of the class array
	    //example
		ArrayList<String> a = new ArrayList<String>();
		// created a object of this array
	    //2.in order to declare what type of elements sit inside it we need to give datatype after classname
		//2.2. example classname<String>  varibalename = new classname<String>();
		//arrayvaribalename.add method is used to add elements to arraylist
		a.add("rahul");
		a.add("malli");
		a.add("guru");
		a.add("madan");
		a.add("pankaja");
		a.remove(2);// to remove any element inside array use arrayvariablename.remove(index);
		a.get(2);// to get any element inside array use arrayvariablename.get(index);
		System.out.println(a.get(2));
		
		
	}

}
