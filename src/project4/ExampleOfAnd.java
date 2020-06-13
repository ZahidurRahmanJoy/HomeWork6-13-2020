package project4;

public class ExampleOfAnd {
	public static void main(String[] args) 
    { 
  
        int num1 = 10324; 
        int num2 = 304225; 
        int num3 = 453; 
  
        
        if (num1 >= num2 && num1 >= num3) 
            System.out.println( 
                num1 
                + " is the largest number."); 
        else if (num2 >= num1 && num2 >= num3) 
            System.out.println( 
                num2 
                + " is the largest number."); 
        else
            System.out.println( 
                num3 
                + " is the largest number."); 
    } 


}
