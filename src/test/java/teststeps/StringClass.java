package teststeps;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //** String is a class in java**   
		//1.String can be definded in two ways one way is 
		//2.syntax String variablename = "string value";
		//3.String literal
		String s = "rahul shetty academy";
		String s1 = "rahul shetty academy";
		//4.this wont create a separate object this will point to 
		//-above string location as the string value is same
        //5.another way of creating the string is String Object  	
        String S2 = new String("WE   L   COME"); 
        String s3 = new String ("WELCOME");
        //6.this will create a new object in java because of new keyword
        //7.for breaking of string we have to use stringvariablename.split(""); methods and inside those two double inverted commas we need to use the delimiter
        //- based upo the delimmeter used the whole array splits into pieces.
        //example
        String[] str = S2.split("L");
        //the splitted strings can only be assigned to array
        //how to trim the whitespaces itcan be done by using .trim method on the splitted String
        
        System.out.println(str[0].trim());
        System.out.println(str[1].trim());
        
        //string is nothing but array of charectors so we can iterate it 
        
        for (int i=0;i<S2.length();i++)
        {
        	  System.out.println(S2.charAt(i));  // this stringvariablename.charAt(Index) gives us the charecter at that index given
        }
	//printing the string in reverse order
        for (int j=S2.length()-1;j>=0;j--)
        {
        	System.out.println(S2.charAt(j));
        }	
	}

}
