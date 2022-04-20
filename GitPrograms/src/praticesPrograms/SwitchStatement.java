/*
 Syntax:

switch(expression){    
case value1:    
 //code to be executed;    
 break;  //optional  
case value2:    
 //code to be executed;    
 break;  //optional  
......    
    
default:     
  code to be executed if all cases are not matched;  
}    

 */

package praticesPrograms;

public class SwitchStatement {

	public static void main(String[] args) {
	
		 //Declaring a variable for switch expression  
	    int number=20;  
	    //Switch expression  
	    switch(number){  
	    //Case statements  
	    case 10: System.out.println("100");  
	    break;  
	    case 20: System.out.println("200");  
	    break;  
	    case 30: System.out.println("300");  
	    break;  
	    //Default case statement  
	    default:System.out.println("Not in 100, 200 or 300");  
	    }  
	}

}
