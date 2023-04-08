package teststeps;

public class Arrayas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.how to initialize the Array
		//2.by using [] immediately after the datatype we can initialize the array 
		//- and use new keyword and again datatype with [] and put number of elements inside 
		//3.examples:
		
		int[] err = new int[5];
		//4.and we can put the elements inside the array by using varibale name and [] immedietely and put the element number that you want to initialize
		//-= value
		 err[0] = 1;
		 err[1] = 2;
		 err[2] = 3;
		 err[3] = 4;
		 err[4] = 5;
	//5.index starts from 0
    //6.To print values in array by for loop we can print
    //7.Size of the array can be find out from array method- arrayvariablename.length 
		
		 for(int i=0; i< err.length; i++)
			 // there should be semicolon after each initialization inside the for loop
			 
		 {
			 System.out.println(err[i]);
			 
			 
		 }
	}

}
