package teststeps;

public class Enhancedforloop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.other type of initializing array 
		//2.by using datatype[] varibale name = {value1,value2}
        String[] str = {"step1","step2","step3","step4"};
        //3. enhanced for loop
        //4. syntax : for(datatype anyvariable name : arrayvariable name)
        //5.example
         for(String s: str)
         {
        	 System.out.println(s);
         }
	}

}
